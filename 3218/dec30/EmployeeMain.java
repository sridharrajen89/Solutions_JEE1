package com.htc.dec30;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class EmployeeMain {

	public static void main(String[] args) throws FileNotFoundException
	{
		try
		{
		Employee emp1 = new Employee(101,"Suresh",40000);
		Employee emp2 = new Employee(102,"Ramesh",50000);
		boolean insert1 = emp1.insertRecord(emp1);
		boolean insert2 = emp2.insertRecord(emp2);
		if(insert1)
		{
			System.out.println("Employee record is inserted successfully :" +emp1);
		}
		
		Employee e = emp2.readRecord(101);
		System.out.println("Employee returned is :" +e);
		
		boolean update1 = emp1.updateRecord(101, 42000);
		if(update1)
		{
			System.out.println("Employee record is updated successfully:" +emp1);
		}
		
		boolean delete1 = emp2.deleteRecord(emp2.getEmployeeNumber());
		if(delete1)
		{
			System.out.println("Employee deleted successfully : " +emp2);
		}
		}
		catch(DuplicateEmployeeIDException de)
		{
			de.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}
		catch(EmployeeNotFoundException ene)
		{
			ene.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
