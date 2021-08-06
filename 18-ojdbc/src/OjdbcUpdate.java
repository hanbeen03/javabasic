import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OjdbcUpdate {
	public static void main(String[] args) {
		Connection con = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		int num;
		String str;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
			
			con = DriverManager.getConnection(url, "mytest", "mytest");
			
			
			System.out.print("수정할 자료의 번호를 입력해주세요 : ");
			num = sc.nextInt();
			
			System.out.print("수정될 문자열을 써주세요 : ");
			str = sc.next();
			
			String sql = "UPDATE ojdbcTest SET str = ? "
					+ "WHERE num = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, str);
			pstmt.setInt(2, num);
			
			
			pstmt.executeUpdate();
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if( con != null && !con.isClosed()) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
