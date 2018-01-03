package test.com;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Empdbmain {
	

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		
		DBConnector dbc=new DBConnector();
		Connection con=dbc.getConnection();
		
		EmpDAO obj=new EmpDAO(con);
		Empcrud emp=new Empcrud(2222,"Shankar-HTC",70000.30);
		try {
			boolean insrt=obj.insertRecord(emp);
			if (insrt)
				System.out.println("Emp record is inserted");
			else
				System.out.println("Error inserting Emp record");
							
		} catch (DuplicateEmployeeException dee) {
			// TODO Auto-generated catch block
			dee.printStackTrace();
		}
		try {
			Empcrud reademp=obj.readRecord(1237);
			if (reademp!=null) 
				System.out.println("Emp details..."+reademp.toString());
			
		} catch (EmployeeNotFndException enfe) {
			enfe.printStackTrace();
		}
		try {
			boolean updemp=obj.updateRecord(1235, 40000.25);
			if (updemp)
				System.out.print("Emp record is updated");
		}
		catch (EmployeeNotFndException enfe) {
			enfe.printStackTrace();
		}
		try {
			boolean dltemp=obj.deleteRecord(2036);
			if (dltemp)
				System.out.print("Emp record is deleted");
		}
		catch (EmployeeNotFndException enfe) {
				enfe.printStackTrace();
		}
			
		}
		
  }

