package HashMapExpample;

import ArrayListExample.DuplicateEmployeeIDException;
import ArrayListExample.Employee;
import ArrayListExample.EmployeeNotFoundException;
import ArrayListExample.ICompanyServiceProvider;

import java.util.HashMap;
import java.util.Map.Entry;

public class CompanyHashMap implements ICompanyServiceProvider{
    private int companyID;
    private String companyName;
    private String companyEmailId;
    private HashMap<Integer, Employee> empMap;

    public CompanyHashMap(int companyID, String companyName, String companyEmailId, HashMap<Integer, Employee> empMap) {
        this.companyID = companyID;
        this.companyName = companyName;
        this.companyEmailId = companyEmailId;
        this.empMap = empMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompanyHashMap that = (CompanyHashMap) o;

        if (companyID != that.companyID) return false;
        return companyName != null ? companyName.equals(that.companyName) : that.companyName == null;
    }

    @Override
    public int hashCode() {
        int result = companyID;
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        return result;
    }

    public int getCompanyID() {

        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyEmailId() {
        return companyEmailId;
    }

    public void setCompanyEmailId(String companyEmailId) {
        this.companyEmailId = companyEmailId;
    }

    @Override
    public String toString() {
        return "CompanyHashMap{" +
                "companyID=" + companyID +
                ", companyName='" + companyName + '\'' +
                ", companyEmailId='" + companyEmailId + '\'' +
                ", empMap=" + empMap +
                '}';
    }

    public HashMap<Integer, Employee> getEmpMap() {
        return empMap;
    }

    public void setEmpMap(HashMap<Integer, Employee> empMap) {
        this.empMap = empMap;
    }

    @Override
    public boolean createEmployee(Employee empObj) throws DuplicateEmployeeIDException {
        for (Integer key :empMap.keySet()){
            if (key==empObj.getEmployeeID()) {
                throw new DuplicateEmployeeIDException();
            }
        }
        empMap.put(empObj.getEmployeeID(),empObj);
        return true;
    }

    public Employee readEmployee(int employeeId) throws EmployeeNotFoundException {
        Employee emp=null;
        for (Entry<Integer, Employee> entry : empMap.entrySet()){
            if (entry.getKey()==employeeId) {
                emp = entry.getValue();
                return emp;
            }
        }
        throw new EmployeeNotFoundException("No Employee Found");
    }

    public boolean updateEmployee(int employeeId, Double newSalary) throws EmployeeNotFoundException {
        Employee emp1=null;
        for (Entry<Integer, Employee> entry : empMap.entrySet()){
            if (entry.getKey()==employeeId)
            {
                entry.getValue().setSalary(newSalary);
                return true;
            }
        }
        throw new EmployeeNotFoundException("No Employee Found to update");
    }
    public boolean deleteEmployee(int employeeId) throws EmployeeNotFoundException {
        //Employee emp = new
        for (Integer key :empMap.keySet()){
            if (key==employeeId) {
                empMap.remove(key);
                return true;
            }
        }
        throw new EmployeeNotFoundException("No Employee Found to delete");
    }
}


