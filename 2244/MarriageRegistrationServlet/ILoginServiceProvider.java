package com.htc.servletExercise;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public interface ILoginServiceProvider 
{
	boolean authenticateUser(String user,String password) throws InvalidCredentialException, ClassNotFoundException, FileNotFoundException, SQLException, IOException; 
}
