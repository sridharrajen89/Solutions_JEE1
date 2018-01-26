package com.htc.servletExercise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MatrimonyServiceProvider implements ILoginServiceProvider
{
	@Override
	public boolean authenticateUser(String user, String password) throws InvalidCredentialException, ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		DBConnection db = new DBConnection();
		Connection con = db.getConnection();
		CallableStatement statement = con.prepareCall("{call validateRegister(?,?)}");
		statement.setString(1,user);
		statement.setString(2,password);
		ResultSet rs = statement.executeQuery();
		if(rs.next())
		{
			System.out.println("Entered Valid user Loop..");
			return true;
		}
		else
		{
			throw new InvalidCredentialException("Entered Username and password are incorrect please enter valid credintials");
		}

	}

}