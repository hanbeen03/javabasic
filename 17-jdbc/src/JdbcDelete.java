import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDelete {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/sqldb";
			
			con = DriverManager.getConnection(url, "root", "mysql");
			
			stmt = con.createStatement();
			
			System.out.print("삭제할 번호를 입력해주세요 : ");
			num = sc.nextInt();
			
			String sql = "DELETE FROM JDBCInsert " +
					"WHERE num = " + num;
			
			System.out.println(sql);
			
			stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con != null && !con.isClosed()) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
