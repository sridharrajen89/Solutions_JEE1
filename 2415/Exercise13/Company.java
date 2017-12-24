package ArrayListExample;

import java.util.ArrayList;

public class Company implements ICompanyServiceProvider {
    private int companyID;
    private String companyName;
    private String companyEmailId;
    private ArrayList<Employee> empList;
    private Employee empObj;

    public Company(int companyID, String companyName, String companyEmailId, ArrayList<Employee> empList) {
        this.companyID = companyID;
        this.companyName = companyName;
        this.companyEmailId = companyEmailId;
        this.empList = empList;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public String getCompanyname() {
        return companyName;
    }

    public void setCompanyname(String companyname) {
        this.companyName = companyname;
    }

    public String getCompanyEmailId() {
        return companyEmailId;
    }

    public void setCompanyEmailId(String companyEmailId) {
        this.companyEmailId = companyEmailId;
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "ArrayListExample.Company{" +
                "companyID=" + companyID +
                ", companyName='" + companyName + '\'' +
                ", companyEmailId='" + companyEmailId + '\'' +
                ", empList=" + empList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (companyID != company.companyID) return false;
        if (companyName != null ? !companyName.equals(company.companyName) : company.companyName != null) return false;
        if (companyEmailId != null ? !companyEmailId.equals(company.companyEmailId) : company.companyEmailId != null)
            return false;
        return empList != null ? empList.equals(company.empList) : company.empList == null;
    }

    @Override
    public int hashCode() {
        return companyID;
    }

    @Override
    public boolean createEmployee(Employee empObj) throws DuplicateEmployeeIDException {
        for (Employee emp : empList) {
            if (emp.getEmployeeID() == empObj.getEmployeeID()) {
                throw new DuplicateEmployeeIDException();
            }
        }
        empList.add(empObj);
        //System.out.println("Emp Added");
        return true;
    }

    @Override
    public Employee readEmployee(int empId) throws EmployeeNotFoundException {
        Employee emp = null;
        for (Employee emp1 : empList) {
            if (emp1.getEmployeeID() == empId) {
                emp = emp1;
                //System.out.println(emp.toString());
                return emp;
            }
        }
        throw new EmployeeNotFoundException("ArrayListExample.Employee not found for the ArrayListExample.Employee ID");
    }

    public boolean updateEmployee(int empId, Double newSalary) throws EmployeeNotFoundException {
        //ArrayListExample.Employee emp = null;
        boolean updateFlag = false;
        for (Employee emp1 : empList) {
            if (emp1.getEmployeeID() == empId) {
                emp1.setSalary(newSalary);
                updateFlag = true;
                return updateFlag;
            }
        }
        throw new EmployeeNotFoundException("ArrayListExample.Employee not found for the ArrayListExample.Employee ID");
    }

    public boolean deleteEmployee(int empId) throws EmployeeNotFoundException {
        //ArrayListExample.Employee emp = null;
        boolean deleteFlag = false;
        for (Employee emp1 : empList) {
            if (emp1.getEmployeeID() == empId) {
                empList.remove(emp1);
                deleteFlag = true;
                return deleteFlag;
            }
        }
        throw new EmployeeNotFoundException("ArrayListExample.Employee not found for the ArrayListExample.Employee ID");
    }
}
