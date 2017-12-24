package HashMapExpample;
//  import ArrayListExample.Company;
//import ArrayListExample.Company;

import ArrayListExample.DuplicateEmployeeIDException;
import ArrayListExample.Employee;
import ArrayListExample.EmployeeNotFoundException;

import java.util.HashMap;

public class HashMapMain {

    public static void main(String[] args) {

        try {
            HashMap<Integer, Employee> empMap = new HashMap<>();
            Employee emp;
            emp = new Employee(100, "Shankar", 50000);
            CompanyHashMap comp = new CompanyHashMap(0001, "HTC", "bhavanishankar@htc.com", empMap);
            comp.createEmployee(emp);
            System.out.println(comp.readEmployee(100));
            comp.createEmployee(new Employee(101, "Divya", 40000));
            System.out.println(comp.readEmployee(101));
            comp.createEmployee(new Employee(102, "DivyaShankar", 60000));
            comp.createEmployee(new Employee(103, "Pradeep", 55000));
            comp.updateEmployee(100, 90000.00);
            System.out.println(comp.readEmployee(100));
            System.out.println(comp.readEmployee(102));
            comp.deleteEmployee(102);
            //System.out.println(comp.readEmployee(102));
            System.out.println(comp.readEmployee(103));
            System.out.println(empMap);
        } catch (EmployeeNotFoundException EFN) {
            EFN.printStackTrace();
        } catch (DuplicateEmployeeIDException DEE) {
            DEE.printStackTrace();
        } catch(Exception ex){
            ex.printStackTrace();
        }
        finally {
        }

    }
}
