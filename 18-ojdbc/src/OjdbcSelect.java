import java.sql.*;

public class OjdbcSelect {

	public static void main(String[] args) {
		Connection con = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost/XEPDB1";
			
			con = DriverManager.getConnection(url, "hr", "hr");
			
			stmt = con.createStatement();
			
			String sql = "SELECT employee_id, first_name, "
					+ "hire_date, job_id, salary FROM employees";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("아이디 : " + rs.getInt(1) 
				+ ", 성 : " + rs.getString(2) + ", 입사일 : " 
				+ rs.getDate(3) + ", 직무명 : " + rs.getString(4) 
				+ ", 연봉 : " + rs.getInt(5));
//				System.out.printf("아이디 : %d, 성 : %10s, 입사일 : %10s, "
//						+ "직무명 : %7s, 연봉 : %5d", rs.getInt("employee_id")
//						, rs.getString);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩  실패");
		} catch (SQLException e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if (con != null && !con.isClosed()) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
