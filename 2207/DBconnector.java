package com.project14.sql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;


	public class DBconnector {

		private Properties connectionProperties = new Properties();

		public Connection getConnection() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException
		{
			connectionProperties.load(new FileInputStream("C:\\RAMI\\JAVAWORK\\htcproject13\\db.properties"));
			Class.forName(connectionProperties.getProperty("driver"));
			Connection connection = DriverManager.getConnection(
			connectionProperties.getProperty("url"),
			connectionProperties.getProperty("username"), 
			connectionProperties.getProperty("password"));
			System.out.println("Connection info:" + connection);
			System.out.println("Opened database successfully");
			return connection;
	      	 
	    }
	}


