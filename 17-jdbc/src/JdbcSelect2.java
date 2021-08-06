import java.sql.*;
import java.util.Scanner;

public class JdbcSelect2 {

	public static void main(String[] args) {
		// 1.커넥터 연결을 해 주세요. employees DB를 연결합니다.
		// 2.조회구문은 
		// SELECT emp_no, first_name from employees limit 10;
		// 3.위 조회구문으로 조회한 결과물을 while문을 활용해서
		// 콘솔창에 사번 : emp_no, 성 : first_name과 같은 형태로
		// 10줄을 출력하도록 처리해주세요.
		// hint) while(rs.next()) 를 조건식으로 잡으면
		// 정확하게 ResultSet에 저장된 만큼만 반복하고 끝납니다.
		Scanner sc = new Scanner(System.in);
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int num;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/employees";
			
			con = DriverManager.getConnection(url, "root", "mysql");
			
			stmt = con.createStatement();
			
			System.out.print("조회할 인원 수 : ");
			num = sc.nextInt();
			
			String sql = 
					"SELECT emp_no, first_name, hire_date FROM employees LIMIT " 
			+ num;
			
			rs = stmt.executeQuery(sql);
			
			
			while(rs.next()) {
				System.out.println("사번 : " + rs.getInt(1)
				+ " , 성 : " + rs.getString(2) + " , 입사날짜 : "
				+ rs.getDate("hire_date"));
			}
			
			
		} catch (Exception e) {
			System.out.println("에러 : " + e);
		} finally {
			try {
				if( con != null && !con.isClosed()) {
					con.close();
				}
			} catch (Exception e) {
				System.out.println("에러 : " + e);
			}
		}
	}

}
