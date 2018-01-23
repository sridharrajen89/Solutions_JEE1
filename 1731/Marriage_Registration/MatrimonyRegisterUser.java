package htc.test.user;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import htc.test.user.dbconnector.*;

	public class MatrimonyRegisterUser implements IRegisterUserServiceProvider{
		
		private Connection con;
		
		public MatrimonyRegisterUser() throws SQLException {
			con = DBConnector.getConnection();
		}
		
	
	public boolean createUser(RegisteredUser newUser) throws DuplicateUserException, SQLException {
		Statement stmt = con.createStatement();

		// Create New Table if it doesn't exist   
		String sqlStr = "CREATE TABLE IF NOT EXISTS Registration(name varchar(20),dateOfBirth integer, gender varchar(6), profession varchar(20), email varchar(15), pasword varchar(10))";
		boolean ret = stmt.execute(sqlStr); 
		System.out.println(ret);
		

		boolean result=false;
		CallableStatement cstmt = con.prepareCall("{call insertRegisteredUser(?,?,?,?,?,?)}");
		cstmt.setString(1, newUser.getName());
		cstmt.setInt(2, newUser.getDateOfBirth());
		cstmt.setString(3, newUser.getGender());
		cstmt.setString(4, newUser.getProfession());
		cstmt.setString(5, newUser.getEmail());
		cstmt.setString(6, newUser.getPassword());
				
		int insertCount=cstmt.executeUpdate();// actual execution happens 
		System.out.println(insertCount);
		if(insertCount ==0) 
		{
			result=true;
			return result;
		}
			else {
			throw new DuplicateUserException();
			}
	}
}
