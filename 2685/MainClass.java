package org.userdb;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		DBConnector dbc = new DBConnector();
		Connection con = dbc.getConnection();
		UserDAO obj = new UserDAO(con);
//		User user = new User();
		User user = new User("abc","pwd","uaddr","user@gmail.com");
		System.out.println(obj.registerUser(user));
	}

}
