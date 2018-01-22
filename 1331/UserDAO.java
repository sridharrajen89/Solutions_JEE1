package com.register.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class UserDAO {

	Properties prop = new Properties();
	
	public Connection getConnection() throws SQLException,IOException,FileNotFoundException,ClassNotFoundException
	{
			prop.load(new FileInputStream("C:/Users/mail2/Documents/workspace-sts-3.9.0.RELEASE/ServeltExcercises/src/com/register/classes/ConnectionFile.properties"));
		    Class.forName(prop.getProperty("driver"));
			String url = prop.getProperty("url");
			String user = prop.getProperty("username");
			String password = prop.getProperty("password");
			Connection con = DriverManager.getConnection(url,user,password); 
			return con;
	}
}
