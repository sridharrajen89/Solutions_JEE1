package com.htc.excercise1;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDataSource {
	String dbType;
	
	//Constructor
	public MyDataSource(String dbType) {
		this.dbType = dbType;
	}
	
	//getConnection method read the property file and return the connection
	public Connection getConnection()  throws SQLException {
		  String driv = "",url = "",user="",password="";
		  String fileName = "";
		
		  if(dbType.equalsIgnoreCase("postgres")) {
		      fileName = "pssource";
		  }
		  try{
			    FileReader reader = new FileReader("C:\\DEV\\JavaPractiseHTC\\Workspace\\SadaGudlaPractise\\src\\"+fileName + ".properties");
			    Properties props = new Properties();
			    props.load(reader);
			    driv = props.getProperty("driver");
			    url = props.getProperty("url");
			    user = props.getProperty("username");
			    password = props.getProperty("password");
			    Class.forName(driv);
			  }catch(IOException e){
			     e.printStackTrace();
			  }catch(ClassNotFoundException e) {
				  e.printStackTrace();
			  }
			  Connection conn = DriverManager.getConnection(url, user, password);
			  return conn;
	}
}
