package com.htc.servletExercise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MatrimonyRegisterUser implements IRegisterUserServiceProvider
{
	@Override
	public boolean createUser(UserRegistration u) throws UserNameDuplicateException, ClassNotFoundException, FileNotFoundException, SQLException, IOException 
	{
		boolean result=false;
		DBConnection dbc = new DBConnection();
		Connection con =dbc.getConnection();
		String email = u.getEmailID();
		System.out.println(email);
		CallableStatement statement = con.prepareCall("{call selectRegister(?)}");
		statement.setString(1, email);
		ResultSet rs = statement.executeQuery();
		if(rs.next())
		{
			throw new UserNameDuplicateException("User already exist please enter different user details");
		}
		else
		{
			statement = con.prepareCall("{call insertRegister(?,?,?,?,?,?,?)}");
			statement.setString(1,u.getName());
			statement.setString(2,u.getDob());
			statement.setString(3,u.getGender());
			statement.setString(4,u.getPicureloc());
			statement.setString(5,u.getProfession());
			statement.setString(6,u.getEmailID());
			statement.setString(7,u.getPassword());
			int insertCount=statement.executeUpdate();
			if(insertCount == 0)
			{
				result =true;
			}
		}
	return result;	
	}


}
