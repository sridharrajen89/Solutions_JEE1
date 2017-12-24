package ArrayListExample;

public interface ICompanyServiceProvider {
    public boolean createEmployee(Employee empObj) throws DuplicateEmployeeIDException;
    public Employee readEmployee(int employeeID) throws EmployeeNotFoundException;
    public boolean updateEmployee(int employeeID, Double newSalary) throws EmployeeNotFoundException;
    public boolean deleteEmployee(int employeeID) throws  EmployeeNotFoundException;
}
