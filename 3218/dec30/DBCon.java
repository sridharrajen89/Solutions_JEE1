package com.htc.dec30;


	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.sql.*;
	import java.util.Properties;

	public class DBCon {

		private Properties connectionProperties = new Properties();

		public Connection getConnection() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException
		{
			
			connectionProperties.load(new FileInputStream("ConnectionFile.properties.txt"));
			Class.forName(connectionProperties.getProperty("driver"));
			Connection connection = DriverManager.getConnection(
			connectionProperties.getProperty("url"),
			connectionProperties.getProperty("username"), 
			connectionProperties.getProperty("password"));
			System.out.println(connection);
			return connection;
	      	 
	    }
	}



