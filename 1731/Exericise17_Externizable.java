package htc.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Exericise17_Externizable {

	public static void main(String[] args) {


			Employee emp1 = new Employee();
			ArrayList<Employee> empList = new ArrayList<Employee>(); 

			emp1 = new Employee(1001,"Smith",75000,"abcd123", 101); 
			empList.add(emp1); 
			emp1 = new Employee(1002,"Aaron",89000,"abcd124", 102);    
			empList.add(emp1); 
			emp1 = new Employee(1003,"David",95000,"abcd125", 103); 
			empList.add(emp1); 
			emp1 = new Employee(1004,"Chris",60000,"abcd126", 104); 
			empList.add(emp1); 
			emp1 = new Employee(1005,"Trump",54000,"abcd127", 105); 
			empList.add(emp1); 
			
			// Serialize the Employee
	        try {
	        	
	             FileOutputStream fo = new FileOutputStream("Emp2.txt");
	            
				ObjectOutputStream so = new ObjectOutputStream(fo);
	            so.writeObject(empList); // Is this correct
	            so.flush();
	        }
	        catch (Exception e) {
	            System.out.println(e);
	        }

	        Employee newEmpl = null;
	        		
	     // Deserialize the employee
	        try {
	            FileInputStream fi = new FileInputStream("Emp2.txt");
	            ObjectInputStream si = new ObjectInputStream(fi);
	            
	            // Facing Issue here	            
	            newEmpl = (Employee)si.readObject();
	        }
	        catch (Exception e) {
	            System.out.println(e);
	        }
	 
	        System.out.println("The original Employee :\n" + empList);
	        System.out.println("The new Employee is:\n" + newEmpl);
	    }

		
	}
