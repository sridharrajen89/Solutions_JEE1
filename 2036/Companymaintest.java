package test.com;
import java.util.*;

public class Companymaintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		
		try {

		Employee emp1 =new Employee(2036,"Shankar S",50000);
		Employee emp2= new Employee(2038,"Suresh",60000);
		/*Employee emp3= new Employee(2039,"Ramesh",90000);*/
		
														
		Company cmp=new Company(123,"HTC","abc@htcinc.com",emplist);
		
			if (cmp.createEmployee(emp1)) {
				System.out.println("New employee created");
			}
			
			System.out.println("Create 2nd emp recod..."+cmp.createEmployee(emp2));
			
			System.out.println("RetrieveEmployee..."+cmp.readEmployee(2036));
			System.out.println("Update Emp salary..."+cmp.updateEmployee(2036,800000));
			System.out.println("RetrieveEmployee after salary update..."+cmp.readEmployee(2036));
			
			if (cmp.deleteEmployee(2038)) {
				System.out.println("Emp record successfully deleted");
			}
			
			System.out.println("List all employees in company..."+cmp);

				
		}
		
		catch (EmployeeNotFoundException enf) {
			// TODO Auto-generated catch block
			enf.printStackTrace();				
		} 
		catch (DuplicateEmployeeIDException dee) {
			dee.getERRORMESSAGE();
			dee.printStackTrace();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			emplist.clear();
		}
		

	}

}
