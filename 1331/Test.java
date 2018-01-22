package com.register.classes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class Test {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException, IOException, ParseException {
		
		Connection con = new UserDAO().getConnection(); 
		CallableStatement statement = null;
		statement = con.prepareCall("{call validateuser1(?,?)}");
		statement.setString(1, "deepthi.sripathi1@gmail.com");
		statement.setString(2, "Intel");
		
		ResultSet rs = statement.executeQuery();
		
		if(rs.next())		
		{	
			System.out.println(rs.getInt(1));
		}
		else
		{
			System.out.println("Hello");
		}
		

	}

}
