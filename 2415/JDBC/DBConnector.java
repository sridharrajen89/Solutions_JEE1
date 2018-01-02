package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnector {
	private Properties connectionProperties = new Properties();
	
	public Connection getConnection() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException
	{
		connectionProperties.load(new FileInputStream("C:\\Users\\bhava\\Documents\\Java\\HTCTraining\\src\\jdbc\\ConnectionFile.properties"));
		Class.forName(connectionProperties.getProperty("driver"));
		Connection con = DriverManager.getConnection(
		connectionProperties.getProperty("url"),
		connectionProperties.getProperty("username"), 
		connectionProperties.getProperty("password"));
		System.out.println(con);
		return con;
		
	}

}