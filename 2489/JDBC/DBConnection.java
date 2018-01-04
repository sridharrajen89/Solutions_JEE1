package com.htc.exe3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	private Properties connectionProperties = new Properties();
	public Connection getConnection() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException 
	{ 
		connectionProperties.load(new FileInputStream("D:\\JaveOffice\\ConnectionFile.txt")); 
		Class.forName(connectionProperties.getProperty("driver")); 
		Connection connection = DriverManager.getConnection( 
		connectionProperties.getProperty("url"), 
		connectionProperties.getProperty("username"),  
		connectionProperties.getProperty("password")); 
		return connection;       	  
	} 	  
}