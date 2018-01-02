package com.java.exercise3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class EmployeeTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{
			DBConnector dbc=new DBConnector();
		Connection con=dbc.getConnection();
		HTCGlobalServices htc = new HTCGlobalServices(con);
		Employee obj = htc.readRecord(4);
		System.out.println(obj);
		Employee emp=new Employee(17,"harry",300);
		htc.insertRecord(emp);
		htc.updateRecord(16, 1000);
		htc.deleteRecord(12);
		con.close();
	}
	catch(DuplicateEmployeeIDException ae){ae.printStackTrace();}
	catch(EmployeeNotFoundException ae) {ae.printStackTrace();}
	catch(Exception ae) {ae.printStackTrace();}
	}
}
