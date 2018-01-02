/**
 * 
 */
package com.java.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Radhika
 *
 */
public class SelectDemo {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.postgresql.Driver";  
	static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";

   //  Database credentials
  static final String USER = "postgres";
  static final String PASS = "1234";
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {
			System.out.println("Test SQL");
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println(conn.getCatalog());
			System.out.println(conn.getSchema());
			
		     //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		      System.out.println(stmt.getClass());
		      String sql;
		      sql = "SELECT \"Employee\".\"employeeNumber\", "
		      		+ "\"Employee\".\"employeeName\", "
		      		+ "\"Employee\".\"employeeSalary\" "
		      		+ "FROM public.\"Employee\"";
		      ResultSet rs = stmt.executeQuery(sql);

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("employeeNumber");
		         String name = rs.getString("employeeName");
		         Double sal = rs.getDouble("employeeSalary");

		         //Display values
		         System.out.print("ID: " + id);
		         System.out.print(", name: " + name.trim());
		         System.out.println(", salary: " + sal);
		      }
		      //STEP 6: Clean-up environment
		      rs.close();
		      stmt.close();
		      conn.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
