package com.htc.ureg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MatrimonyServiceProvider implements ILoginServiceProvider
{

	@Override
	public boolean authenticateUser(String user, String password) throws InvalidCredintialsException, ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		DBCon db = new DBCon();
		Connection con = db.getConnection();
		CallableStatement statement = con.prepareCall("{call validateregrecord(?,?)}");
		statement.setString(1,user);
		statement.setString(2,password);
		ResultSet rs = statement.executeQuery();
		if(rs.next())
		{
			//System.out.println("Valid user");
			return true;
		}
		else
		{
			throw new InvalidCredintialsException("Entered Username and password are incorrect please enter valid credintials");
		}
		
	}

}
