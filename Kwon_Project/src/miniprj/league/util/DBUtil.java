package miniprj.league.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	// Á¢¼Ó
	public static Connection getConnection() throws Exception {
		Connection conn = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "kwon";
		String password = "gurals22";
		conn = DriverManager.getConnection(url, user, password);

		return conn;
	}

	public static void close(Connection conn, Statement ps) {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Connection conn, Statement ps, ResultSet rs) {

		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		close(conn, ps);

	}
	// ´Ý±â
}
