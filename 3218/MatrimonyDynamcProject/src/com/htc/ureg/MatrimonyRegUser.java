package com.htc.ureg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MatrimonyRegUser implements IRegisterUserServiceProvider
{
	
	@Override
	public boolean createUser(UserRegistration u) throws UserNameDuplicatedException, ClassNotFoundException, FileNotFoundException, SQLException, IOException 
	{
		boolean result=false;
		DBCon dbc = new DBCon();
		Connection con =dbc.getConnection();
		String email = u.getEmail();
		System.out.println(email);
		CallableStatement statement = con.prepareCall("{call selectregrecord(?)}");
		statement.setString(1, email);
		ResultSet rs = statement.executeQuery();
		if(rs.next())
		{
			throw new UserNameDuplicatedException("User already exist please enter unique user details");
		}
		else
		{
			statement = con.prepareCall("{call insertregrecord(?,?,?,?,?,?,?)}");
			statement.setString(1,u.getName());
			statement.setString(2,u.getDob());
			statement.setString(3,u.getGender());
			statement.setString(4,u.getPicsloc());
			statement.setString(5,u.getProfession());
			statement.setString(6,u.getEmail());
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
