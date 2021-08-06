import java.sql.*;
import java.util.Scanner;

public class JdbcUpdate {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		Statement stmt = null;
		int num;
		String str;
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/sqldb";
			
			con = DriverManager.getConnection(url, "root", "mysql");
			
			stmt = con.createStatement();
			
			System.out.print("수정할 글 번호 : ");
			num = sc.nextInt();
			
			System.out.println("수정할 글 내용 : ");
			str = sc.next();
			
			String sql = "UPDATE JDBCInsert SET str = '" + str
					 + "' WHERE num = " + num;
			
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
