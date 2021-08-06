import java.sql.*;
import java.util.Scanner;

public class JdbcInsert {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		int num;
		String str;
		// ResultSet은 SELECT 구문에 대한 결과만 처리함.
		// 이외 구문에는 불필요.
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/sqldb";
			
			con = DriverManager.getConnection(url, "root", "mysql");
			
			stmt = con.createStatement();
			
			System.out.print("숫자를 입력해주세요 : ");
			num = sc.nextInt();
			
			System.out.printf("문자열을 입력해주세요 : ");
			str = sc.next();
			
//			String sql = "INSERT INTO JDBCInsert (num, str) " +
//					"VALUES (1, '자바')";
			
			String sql = "INSERT INTO JDBCInsert VALUES " +
						"(" + num + ", '" + str + "')";
			
			//System.out.println(sql);
			//String sql = "INSERT INTO JDBCInsert VALUES (2, '파이썬')";
			
			// SELECT 문은 executeQuery(sql구문); 형식으로 호출하지만
			// 이외 구문은 executeUpdate(sql구문); 으로 호출합니다.
			
			stmt.executeUpdate(sql);
			
			
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
