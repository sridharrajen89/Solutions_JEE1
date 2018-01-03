package com.htc.CoreJavaExercise3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.postgresql.util.PSQLException;


//import com.htc.CoreJavaExercise3.EmployeeNotFoundException.HTCGlobalServices;

public class TestCRUDEmployee {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException
	{		// TODO Auto-generated method stub
		System.out.println("basic CRUD operation on Employee Table"); 
		DBConnector dbc=new DBConnector();
		Connection con=dbc.getConnection();
		Employee emp = new Employee (10,"Matt H",6000);
		HTCGlobalServices empCRUD = new HTCGlobalServices(con);
		try {
			if (empCRUD.insertRecord(emp))
				System.out.println("Employee Record inserted successfully");
		} catch (DuplicateEmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(empCRUD.readRecord(1));
			System.out.println(empCRUD.updateRecord(6, 7750));
			System.out.println(empCRUD.deleteRecord(10));
//			System.out.println(empCRUD.deleteRecord(7));
		}
		catch(EmployeeNotFindException ENFE) {
			System.out.println("In EmployeeNotFoundException");
		}
		catch(PSQLException SE) {
			System.out.println("In SQL Exception");
		}
		finally {
			con.close();
		}
	}
	}


