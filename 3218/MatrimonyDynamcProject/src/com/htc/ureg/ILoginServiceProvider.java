package com.htc.ureg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public interface ILoginServiceProvider 
{
	boolean authenticateUser(String user,String password) throws InvalidCredintialsException, ClassNotFoundException, FileNotFoundException, SQLException, IOException; 
}
