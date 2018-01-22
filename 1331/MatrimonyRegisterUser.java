package com.register.classes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;

import org.postgresql.util.PSQLException;

public class MatrimonyRegisterUser implements IRegisterLoginUserServiceProvider {

	UserDAO user = new UserDAO();
	Connection con;
	public MatrimonyRegisterUser() {
		
		try {
			con = user.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		} 		
	}
	@Override
	public boolean createUser(Person person) throws DuplicateUserException, SQLException {
		
		CallableStatement statement = null; int insertCount;
		statement = con.prepareCall("{call insertdetails(?,?,?,?,?,?,?)}");
		statement.setInt(1, person.getPersonId());
		statement.setString(2, person.getPersonName());
		statement.setDate(3,person.getDob());
		statement.setString(4, person.getGender());
		statement.setString(5, person.getProfession());
		statement.setString(6, person.getEmail());
		statement.setString(7, person.getPassword());
		
		insertCount= statement.executeUpdate();
		
		if(insertCount == 0)
			return true;
		else
			throw new DuplicateUserException("Email Already Exists , Duplicate User ");
	}
	
	@Override
	public boolean ValidateUser(String email, String password) throws DuplicateUserException, SQLException {
		
		CallableStatement statement = null;
		statement = con.prepareCall("{call validateuser1(?,?)}");
		statement.setString(1, email);
		statement.setString(2, password);
		
		ResultSet rs = statement.executeQuery();
		if(rs.next())		
		{	
			return true;
		}
		else
		{
			return false;
		}
		
	}
	

	
	

}
