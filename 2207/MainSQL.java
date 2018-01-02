package com.project14.sql;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;

public class MainSQL {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException, DuplicateEmployeeException{
		// TODO Auto-generated method stub
		
		DBconnector dbc=new DBconnector();
		Connection con=dbc.getConnection();
		SQLProject1 obj=new SQLProject1(con);
		Employee user=new Employee('1',"htcuser","abc");
		System.out.println(obj.insertRecord(user));
	
		
		
		
		
	}

}
