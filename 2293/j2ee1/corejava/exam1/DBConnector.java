package j2ee1.corejava.exam1;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnector {
	public Connection getConnection() throws SQLException {

		String driver = "", url = "", user = "", password = "";

		String fileName = "connection";

		try {

			FileReader reader = new FileReader(
					"C:\\Dev\\Workspaces\\HTC_JavaTraining_WS\\Excercises_Proj\\" + fileName + ".properties");

			Properties props = new Properties();

			props.load(reader);

			driver = props.getProperty("driver");

			url = props.getProperty("url");

			user = props.getProperty("username");

			password = props.getProperty("password");

			Class.forName(driver);

		} catch (IOException e) {

			e.printStackTrace();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

		Connection conn = DriverManager.getConnection(url, user, password);

		return conn;

	}

}
