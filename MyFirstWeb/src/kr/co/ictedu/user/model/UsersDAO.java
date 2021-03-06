package kr.co.ictedu.user.model;

import javax.sql.DataSource;
import javax.naming.*;
import java.sql.*;
import java.util.ArrayList;
//DAO클래스는 DB연동을 전담해 처리합니다.
public class UsersDAO {
	//DB주소 아이디 패스워드 미리 저장
	//일반 DAO 활용시 사용하던 것들
	//private static final String URL = "jdbc:mysql://localhost/ict03";
	//private static final String DBID = "root";
	//private static final String DBPW = "mysql";
	
	//커넥션 풀 성정 후 사용하는 것
	private DataSource ds;
	
	private static final int ID_DELETE_SUCCESS = 1;
	private static final int ID_DELETE_FAIL = 0;
	
	private static final int LOGIN_SUCCESS = 1;
	private static final int LOGIN_FAIL = 0;

	private static final int UPDATE_SUCCESS = 1;
	private static final int UPDATE_FAIL = 0;
	
	
	
	/*
	 * DAO 클래스는 하나의 객체만으로도 DB 연동을 수행할 수 있기 때문에
	 * 메모리 관리 차원에서 클래스의 객체를 단 1개만 생성하도록
	 * 싱클톤 패턴을 적용하여 클래스를 디자인합니다.
	 */
	
	//싱클톤 패턴 클래스 디자인 방법
	// 1.외부에서 객체를 new 키워드로 만들어 쓸 수 없도록 생성자에
	// private을 붙여줍니다.
	private UsersDAO() {
		
		//일반 JDBC에서 활용하던 드라이버 설정 코드
		//try {
		//	Class.forName("com.mysql.cj.jdbc.Driver");
		//} catch (Exception e) {
		//	e.printStackTrace();
		
		//커넥션 풀에서 화룡ㅇ하느 드라이버 설정 코드
		//역시 javax.naming의 요소를 임포트합니다.
		try {
			Context ct = new InitialContext();
			ds = (DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//2. 외부에서 객체 생성을 못 하기 때문에 자기 클래스 내부에서 그냥
	//스스로 자기 자신을 1개 생성합니다.
	private static UsersDAO dao = new UsersDAO();
	
	
	//3. 외부에서 객체 생성이 필요할 때 public 선언으로 처리한
	//getter를 이용해 2에서 만든 객체를 리턴만 해줍니다.
	//이러면 UsersDAO는 참조형 변수이기 때문에 주소값만 전달합니다.
	public static UsersDAO getInstance() {
		return dao;
	}
	
	//회원가입을 처리하는 메서드 선언
	//DB에 들어가는 데이터, 혹은 DB에서 출력되어 나오는 데이터
	//모두가 UsersVO 내부 자료 형식을 벗어날 수 없으므로
	//대다수 입출력은 전부 VO를 매개로 진행합니다.
	public int joinUsers(UsersVO user) {
		//users_join.jsp에서 가져온 코드를 이곳에 붙여넣기를 합니다.
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			
			//JDBC기준 DB접속 코드
			//con = DriverManager.getConnection(URL, DBID, DBPW);
			
			//커넥션 풀 기준 DB접속 코드
			con = ds.getConnection();
			
			//String select = "SELECT * FROM users WHERE id = ?";
			
			//pstmt = con.prepareStatement(select);
			
			//pstmt.setString(1, id);
			
			//rs = pstmt.executeQuery();
			
			//if(!rs.next()) {
			
				String sql = "INSERT INTO users VALUES (?, ?, ?, ?)";
				
				pstmt = con.prepareStatement(sql);
				
				pstmt.setString(1, user.getId());
				pstmt.setString(2, user.getPw());
				pstmt.setString(3, user.getUname());
				pstmt.setString(4, user.getEmail());
				
				pstmt.executeUpdate();
			//} else {
				//out.println("<h3>이미 존재하는 아이디입니다. 다시 입력해주세요.</h3>");
			//}
			
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if ( con != null && !con.isClosed()) {
					con.close();
				}
				if ( pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 1;
	}//end joinUser
	
	//원래 대다수 DAO는 UsersVO 하나로 모든 처리를 해결할 수 있습니다.
	//다만 삭제로직은 폼에서 날린 비밀번호와 원래 DB에 저장되어있던 비밀번호를
	//비교해야 하기 때문에 날린 비밀번호를 추가로 입력 받습니다.
	public int usersDelete(UsersVO user, String dpw) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			
			if(user.getPw().equals(dpw)) {
				
				//con = DriverManager.getConnection(URL, DBID, DBPW);
				con = ds.getConnection();
				
				String sql = "DELETE FROM users WHERE id = ?";
					
				pstmt = con.prepareStatement(sql);
					
				pstmt.setString(1, user.getId());
					
				pstmt.executeUpdate();
				
				//내부적으로 session, response 등 내장 객체에 대한
				//처리를 할 수 없으므로 결과 정보만 리턴
				return 1;
			} else {
				//비밀번호를 틀리게 입력한 경우
				return 0;
			}
			
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if ( con != null && !con.isClosed()) {
					con.close();
				}
				if ( pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//상단 try블럭 내에서 로직이 처리가 안 되어서 여기까지 코드가
		//도달 했다는 자체로 이미 뭔가 실행이 누락되었다는 이야기이므로
		//0을 리턴
		return 0;
	}//end usersDelete
	
	//id넘어와야됨
	public int loginUsers(UsersVO user) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String compareId = "";
		String comparePw = "";
		
		try {
			//con = DriverManager.getConnection(URL, DBID, DBPW);
			con = ds.getConnection();
			
			String sql = "SELECT * FROM users WHERE id = ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, user.getId());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				compareId = rs.getString(1);
				comparePw = rs.getString(2);
				
				if(user.getId().equals(compareId) && user.getPw().equals(comparePw)) {
					return LOGIN_SUCCESS;
				} else {
					return LOGIN_FAIL;
				}
			} else {
				return LOGIN_FAIL;
			}

		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if ( con != null && !con.isClosed()) {
					con.close();
				}
				if ( pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
				if ( rs != null && !rs.isClosed()) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return LOGIN_FAIL;
	}//loginUsers END
	
	public UsersVO getUserInfo(UsersVO user) {
		
		//DB연결 후 입력받은 user의 .getUid()를 이용해 조회구문 완성
		//이후 ResultSet에 담겨있는 자료를 다시 다 꺼내서
		//새로 선언한 UsersVO 변수에 입력해준 후
		//ResultSet에 있던 자료를 입력받은 UsersVO를 리턴
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		UsersVO userForReturn = new UsersVO();
		
		try {
			//con = DriverManager.getConnection(URL, DBID, DBPW);
			con = ds.getConnection();
			
			String sql = "SELECT * FROM users WHERE id = ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, user.getId());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
			
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String uname = rs.getString("uname");
				String email = rs.getString("email");
				
				//UsersVO userForReturn = 
					//	new UsersVO(id, pw, uname, email);
			
				userForReturn.setId(id);
				userForReturn.setPw(pw);
				userForReturn.setUname(uname);
				userForReturn.setEmail(email);
				
				//return userForReturn;
				
			} //else {
				//return null;
			//}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if ( con!=null && !con.isClosed()) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return userForReturn;
	}//getUserInfo END
	
	public int updateUsers(UsersVO user) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			if(user.getPw().equals("") || user.getUname().equals("")) {
				return UPDATE_FAIL;
			} else {
				//con = DriverManager.getConnection(URL, DBID, DBPW);
				con = ds.getConnection();
				
				String sql = "UPDATE users SET pw=?, uname=?, email=? "
						+ "WHERE id = ?";
				
				pstmt = con.prepareStatement(sql);
				
				pstmt.setString(1, user.getPw());
				pstmt.setString(2, user.getUname());
				pstmt.setString(3, user.getEmail());
				pstmt.setString(4, user.getId());
				
				pstmt.executeUpdate();
				
				return UPDATE_SUCCESS;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if( con!=null && !con.isClosed()) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return UPDATE_FAIL;
	}//updateUsers END
	
	public ArrayList<UsersVO> getAllUser() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//비어있는 ArrayList<UsersVO>도 같이 선언
		ArrayList<UsersVO> userList = new ArrayList<>(); 
		
		try {
			//con = DriverManager.getConnection(URL, DBID, DBPW);
			con = ds.getConnection();
			
			String sql = "SELECT * FROM users";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
			
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String uname = rs.getString("uname");
				String email = rs.getString("email");
				
				//UsersVO userForReturn = 
					//	new UsersVO(id, pw, uname, email);
			
				UsersVO temp = new UsersVO(id, pw, uname, email);
				
				userList.add(temp);
	
				//return userForReturn;
				
			} //else {
				//return null;
			//}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if ( con!=null && !con.isClosed()) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return userList;
	}
	
}
