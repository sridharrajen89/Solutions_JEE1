package ArrayListExample;

import java.util.ArrayList;

public class ArrayListMain {

    public static void main(String[] args) {

        try {
            ArrayList<Employee> empList = new ArrayList<Employee>();
            Employee emp;
            emp = new Employee(100, "Shankar", 50000);
            empList.add(emp);
            Company comp;
            comp = new Company(0001, "HTC", "bhavanishankar@htc.com", empList);
            System.out.println(comp.readEmployee(100));
            comp.createEmployee(new Employee(101, "Divya", 40000));
            System.out.println(comp.readEmployee(101));
            comp.createEmployee(new Employee(102, "DivyaShankar", 60000));
            comp.createEmployee(new Employee(103, "Pradeep", 55000));
            comp.updateEmployee(100, 80000.00);
            System.out.println(comp.readEmployee(100));
            System.out.println(comp.readEmployee(102));
            comp.deleteEmployee(102);
//            System.out.println(comp.readEmployee(102));
            System.out.println(comp.readEmployee(103));
            System.out.println(empList);
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
