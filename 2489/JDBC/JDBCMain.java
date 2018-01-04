package com.htc.exe3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCMain {

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Employee emp = new Employee(103,"Uday", 2000);
		DBConnection dbc=new DBConnection();
		Connection con=dbc.getConnection();
		HTCGlobalServices htc = new HTCGlobalServices(con);
		
		//Insert record
		
		try {
			htc.insertRecord(emp);
		} catch (DuplicateEmployeeException DEE) {
			// TODO Auto-generated catch block
			DEE.printStackTrace();
		}
		catch (Exception EX) {
			// TODO Auto-generated catch block
			EX.printStackTrace();
		}
		
		//Read record
		
			try {
				htc.readRecord(101);
			} catch (EmployeeNotFoundException ENF) {
				// TODO Auto-generated catch block
				ENF.printStackTrace();
			}
			catch (Exception EX) {
				// TODO Auto-generated catch block
				EX.printStackTrace();
			}
		
		//Update record
			
			try {
				htc.updateRecord(105, 5000);
			} catch (EmployeeNotFoundException ENF) {
				// TODO Auto-generated catch block
				ENF.printStackTrace();
			}
			catch (Exception EX) {
				// TODO Auto-generated catch block
				EX.printStackTrace();
			}
			
		//Delete record
			
			try {
				htc.deleteRecord(106);
			} catch (EmployeeNotFoundException ENF) {
				// TODO Auto-generated catch block
				ENF.printStackTrace();
			}
			catch (Exception EX) {
				// TODO Auto-generated catch block
				EX.printStackTrace();
			}
			
	}

}
