package app.bokubake.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {

	private static String USER = "postgres";
	private static String PASS = "root";
	private static String SERVER_NAME = "localhost";
	private static String DB_NAME = "onsen";

	public static Connection getConnection() throws Exception{
		try {
			/* ドライバクラスのロード */
			Class.forName("org.postgresql.Driver");

			/* Connectionの作成 */
			Connection conn = DriverManager.getConnection(
					"jdbc:postgresql://" + SERVER_NAME + ":5432/" + DB_NAME,
					USER, PASS);

			return conn;
		} catch (ClassNotFoundException e) {
			throw e;
		}
	}


}
