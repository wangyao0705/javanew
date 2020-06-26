package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rest = null;
		String url = "jdbc:postgresql://localhost:5432/wang";
		String user = "postgres";
		String password = "postgres";

		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, user, password);
			conn.setAutoCommit(false);
			stmt = conn.createStatement();

			String sql = "select id,name,email,kodo,address from userinfo";
			rest = stmt.executeQuery(sql);

			while (rest.next()) {
				int id = rest.getInt("id");
				String name = rest.getString("name");
				String email = rest.getString("email");
				String kodo = rest.getString("kodo");
				String address = rest.getString("address");
				System.out.println(id + ":" + name + ":" + email + ":" + kodo + ":" + address);
			}

		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
