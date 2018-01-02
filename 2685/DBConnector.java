package org.userdb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnector {
	
	private Properties connectionProperties = new Properties();
	
	public Connection getConnection() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		
		connectionProperties.load(new FileInputStream("C:\\Users\\win 7\\workspace\\UserJdbcProj\\ConnectionFile.Properties"));
		Class.forName(connectionProperties.getProperty("driver"));
		Connection connection = DriverManager.getConnection(
				connectionProperties.getProperty("url"),
				connectionProperties.getProperty("username"),
				connectionProperties.getProperty("password")
				);
		System.out.println("Connection is : "+connection);
		return connection;
	}
}
