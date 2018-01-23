package com.htc.ureg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public interface IRegisterUserServiceProvider {
	 boolean createUser(UserRegistration u) throws UserNameDuplicatedException, ClassNotFoundException, FileNotFoundException, SQLException, IOException;
}
