import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MatrimonyRegisterUser implements IRegisterUserServiceProvider{

	Connection con;
	
	public MatrimonyRegisterUser(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public Boolean createUser(RegisterUser user) throws SQLException {
		// TODO Auto-generated method stub
		String name = user.getName();
		String pass = user.getPass();
		String email = user.getEmail();
		String country = user.getCountry();
		
		CallableStatement ps = con.prepareCall("{call registeruser(?,?,?,?)}");
				  
				ps.setString(1,name);  
				ps.setString(2,pass);  
				ps.setString(3,email);  
				ps.setString(4,country);
				
				int i=ps.executeUpdate(); 
				
				return true;
	}

}
