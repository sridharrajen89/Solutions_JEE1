package com.register.classes;

import java.sql.SQLException;

public interface IRegisterLoginUserServiceProvider {
	
	public boolean createUser(Person person) throws DuplicateUserException,SQLException;
	public boolean ValidateUser(String email,String password) throws DuplicateUserException,SQLException;
	

}
