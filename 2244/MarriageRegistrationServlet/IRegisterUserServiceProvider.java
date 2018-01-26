package com.htc.servletExercise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public interface IRegisterUserServiceProvider {
	 boolean createUser(UserRegistration u) throws UserNameDuplicateException, ClassNotFoundException, FileNotFoundException, SQLException, IOException;

}