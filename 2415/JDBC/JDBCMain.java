package jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {		
		// TODO Auto-generated method stub
		 Employee emp;
         emp = new Employee(104, "Divya", 70000);	            	            	                    
         DBConnector dbc=new DBConnector();
 		 Connection con=dbc.getConnection();
         HTCGlobalServices htc = new HTCGlobalServices(con);
         
         // Insert the record into the table
		 try {
	         htc.insertRecord(emp);
	     } catch (DuplicateEmployeeIDException DEE) {
	    	 System.out.println(DEE.getErrorMessage());
	     } catch(Exception ex){
	         ex.printStackTrace();
	     }
	     finally {
	     }
		 
         // Read the record from the table for the given employeeID 
		 try {
			System.out.println(htc.readRecord(103).toString());	
		 } catch (EmployeeNotFoundException EFN) {
	         System.out.println(EFN.getErrorMessage());
	     } catch(Exception ex){
	         ex.printStackTrace();
	     }
	     finally {
	     }
		 
         // Update the salary for the given employeeID		 
		 try {
			 htc.updateRecord(105,73000.00);		         	            
		 } catch (EmployeeNotFoundException EFN) {
			 System.out.println(EFN.getErrorMessage());
		 } catch(Exception ex){
			 ex.printStackTrace();
		 }
		 finally {
		 }
		 
         // Delete the record for the given employeeID		
		 try {
			 htc.deleteRecord(105);		         	            
		 } catch (EmployeeNotFoundException EFN) {
	         System.out.println(EFN.getErrorMessage());
	     } catch(Exception ex){
	         ex.printStackTrace();
	     }
	     finally {
	    	 con.close();
	     }		 		 
	}

}