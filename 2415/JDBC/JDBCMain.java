package jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class JDBCMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {		
		// TODO Auto-generated method stub
		 Employee emp;
         emp = new Employee(102, "Divya", 70000);	            	            	           
         HTCGlobalServices htc = new HTCGlobalServices(0001, "HTC", "bhavanishankar@htc.com", emp);
         
		 try {
	         htc.insertRecord(emp);
	     } catch (DuplicateEmployeeIDException DEE) {
	    	 System.out.println(DEE.getErrorMessage());
	     } catch(Exception ex){
	         ex.printStackTrace();
	     }
	     finally {
	     }
		 
		 try {
			System.out.println(htc.readRecord(100).toString());	
		 } catch (EmployeeNotFoundException EFN) {
	         System.out.println(EFN.getErrorMessage());
	     } catch(Exception ex){
	         ex.printStackTrace();
	     }
	     finally {
	     }
		 
		 try {
			 htc.updateRecord(102,73000.00);		         	            
		 } catch (EmployeeNotFoundException EFN) {
			 System.out.println(EFN.getErrorMessage());
		 } catch(Exception ex){
			 ex.printStackTrace();
		 }
		 finally {
		 }
		 
		 try {
			 htc.deleteRecord(103);		         	            
		 } catch (EmployeeNotFoundException EFN) {
	         System.out.println(EFN.getErrorMessage());
	     } catch(Exception ex){
	         ex.printStackTrace();
	     }
	     finally {
	     }		 		 
	}

}