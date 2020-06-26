package nb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		//gai
		String url = "jdbc:postgresql://localhost:5432/wang";
		String user = "postgres";
		String password = "postgres";

		try {

			//加载驱动
			Class.forName("org.postgresql.Driver");

			//PostgreSQLへ接続
			conn = DriverManager.getConnection(url, user, password);

			//自動コミットOFF
			conn.setAutoCommit(false);

			//SELECT文の実行
			stmt = conn.createStatement();

			/*String sql = "INSERT INTO userinfo (id,name,sex,tel,email,kodo,address,brithday,create_date) "
					+ "VALUES (1010,'王','女','080-6483-4549','wangyao19930715','893-2504','千葉県','1993/9/8',current_timestamp);";
			stmt.executeUpdate(sql);
			conn.commit();
			System.out.println(sql);*/

			/*String sql = "DELETE  from userinfo where id=1010;";
			stmt.executeUpdate(sql);
			conn.commit();
			System.out.println(sql);	*/

			//String sql = "update  userinfo set tel='080-6468-1111' where id=1011；";
			//stmt.executeUpdate(sql);
			//conn.commit();
			//System.out.println(sql);



			//gai
					String sql = "SELECT id,name,tel,address from userinfo";
			//			//
			rset= stmt.executeQuery(sql);

					//SELECT結果の受け取り
				while (rset.next()) {
			//				//gai
			int id = rset.getInt("id");
				String name = rset.getString("name");
					String tel = rset.getString("tel");
					String address = rset.getString("address");
					System.out.println(id + ": " + name + ": " + tel + ": " + address);
				}

		} catch (ClassNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();

		}

	}

	    }

