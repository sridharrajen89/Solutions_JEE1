package test.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnector {
	
	private Properties connectionProperties = new Properties();

	public Connection getConnection() throws SQLException, ClassNotFoundException, FileNotFoundException, IOException
	{
		connectionProperties.load(new FileInputStream("ConnectionFile.properties"));
		Class.forName(connectionProperties.getProperty("driver"));
		Connection connection = DriverManager.getConnection(
		connectionProperties.getProperty("url"),
		connectionProperties.getProperty("username"), 
		connectionProperties.getProperty("password"));
		System.out.println(connection);
		return connection;
	}
}
		
	/* public static void main(String[] args) throws SQLException{
		
		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Demo","postgres","Postgre01");
		if (con!=null) {
			System.out.println("Postgre Db connected...");
		}
		
	}*/
