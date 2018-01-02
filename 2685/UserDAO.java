package org.userdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
	Connection con;

	public UserDAO(Connection con) {
		super();
		this.con = con;
	}
	
	public boolean registerUser(User user) throws SQLException {
		boolean result1 = false;
		String uname,upassword,uaddress,uemail;
		uname = user.getUserName();
		upassword = user.getPassword();
		uaddress = user.getUserAddress();
		uemail = user.getEmail();
		String sql = "INSERT INTO users VALUES(?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);//(PreparedStatement) con.createStatement();
		st.setString(1,uname);
		st.setString(2, upassword);
		st.setString(3, uaddress);
		st.setString(4, uemail);
		int insertCount = st.executeUpdate();
		System.out.println(insertCount);
		if(insertCount>0)		
			result1=true;
		return result1;
//		st.close();
//		return true;
		
	}
}
