package kr.co.ictedu.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	private DataSource ds;
	
	private BoardDAO() {
		try {
			Context ct = new InitialContext();
			ds = (DataSource)ct.lookup("java:comp/env/jdbc/mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static BoardDAO dao = new BoardDAO();
	
	public static BoardDAO getInstance() {
		return dao;
	}
	
	public int write(BoardVO board) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		int resultCode;
		
		//구문작성
		//bId는 auto_increment가 붙어있으므로 입력 안 해도 됨
		String sql = "INSERT INTO jspboard ( bname, btitle, bcontent, bdate, bhit ) "
				+ "VALUES (?, ?, ?, now(), 0)";
		
		try {
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, board.getbName());
			pstmt.setString(2, board.getbTitle());
			pstmt.setString(3, board.getbContent());
			
			pstmt.executeUpdate();
			
			resultCode = 1;
			
		} catch (Exception e) {
			e.printStackTrace();
			resultCode = 0;
		} finally {
			try {
				if( con!= null && !con.isClosed()) {
					con.close();
				}
				if( pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultCode;
	}// Write End
	
	//모든 게시글의 정보를 DB로부터 얻어올 메서드
	public List<BoardVO> getBoardList() {
		//내부에서 사용할 변수 선언
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BoardVO> board = new ArrayList<>();
		//SQL문 작성
		String sql = "SELECT * FROM jspboard ORDER BY bid DESC";
		
		try {
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int bid = rs.getInt("bid");
				String bname = rs.getString("bname");
				String btitle = rs.getString("btitle");
				String bcontent = rs.getString("bcontent");
				Timestamp bdate = rs.getTimestamp("bdate");
				int bhit = rs.getInt("bhit");
				
				BoardVO vo = new BoardVO(bid, bname, btitle, bcontent, bdate, bhit);
				
				board.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			board = null;
		} finally {
			try {
				if( con != null && !con.isClosed()) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return board;
	} //getBoardList End
	
	public BoardVO getBoardDetail(String bId) {
		// bId에 해당하는 글 정보를 가져와서 리턴하도록 로직을 작성해주세요.
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO vo = new BoardVO();
		String sql = "SELECT * FROM jspboard WHERE bid = ?";
		
		try {
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bId);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				vo.setbId(rs.getInt("bid"));
				vo.setbName(rs.getString("bname"));
				vo.setbTitle(rs.getString("btitle"));
				vo.setbContent(rs.getString("bcontent"));
				vo.setbDate(rs.getTimestamp("bdate"));
				vo.setbHit(rs.getInt("bhit"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if ( con != null && !con.isClosed()) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vo;
	}//getBoardDetail END
	
	public int delete(String bid) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result;
		
		String sql = "DELETE FROM jspboard WHERE bid = ?";
		
		try {
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bid);
			
			pstmt.executeUpdate();
			
			result = 1;
		} catch (Exception e) {
			e.printStackTrace();
			result = 0;
		} finally {
			try {
				if( con != null && !con.isClosed()) {
					con.close();
				}
				if( pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	public int update(BoardVO vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result;
		
		String sql = "UPDATE jspboard SET btitle = ?, bcontent = ? "
				+ "WHERE bid = ?";
		
		try {
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, vo.getbTitle());
			pstmt.setString(2, vo.getbContent());
			pstmt.setInt(3, vo.getbId());
			
			pstmt.executeUpdate();
			
			result = 1;
			
		} catch (Exception e) {
			e.printStackTrace();
			result = 0;
		} finally {
			try {
				if( con != null && !con.isClosed()) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public void upHit(String bId) {
		// 필요 변수들을 생성해주세요.
		Connection con = null;
		PreparedStatement pstmt = null;
		// 특정 글의 조회수를 1올리는 쿼리문
		String sql = "UPDATE jspboard SET bhit = bhit + 1 WHERE bid =?";
		
		try {
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bId);
			
			pstmt.executeUpdate();
			
		} catch (Exception e ) {
			e.printStackTrace();
		} finally {
			try {
				if( con != null && !con.isClosed()) {
					con.close();
				}
				if( pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}// END upHit
	
	public List<BoardVO> getPageList(int pageNum) {
		List<BoardVO> board = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM jspboard ORDER BY bid DESC LIMIT ?, 10 ";
		
		try {
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, pageNum);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO vo = new BoardVO();
				
				vo.setbId(rs.getInt("bid"));
				vo.setbName(rs.getString("bname"));
				vo.setbTitle(rs.getString("btitle"));
				vo.setbContent(rs.getString("bcontent"));
				vo.setbDate(rs.getTimestamp("bdate"));
				vo.setbHit(rs.getInt("bhit"));
				
				board.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			board = null;
		} finally {
			try {
				if( con != null && !con.isClosed()) {
					con.close();
				}
				if( pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
				if( rs != null && !rs.isClosed()) {
					rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return board;
	}
	
	public int getBoardCount() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		
		String sql = "SELECT COUNT(*) FROM jspboard";
		
		try {
			con = ds.getConnection();
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			rs.next();
			
			result = rs.getInt(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if( con != null && !con.isClosed()) {
					con.close();
				}
				if( pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
				if( rs != null && !rs.isClosed()) {
					rs.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
