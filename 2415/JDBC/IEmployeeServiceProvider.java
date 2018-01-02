package jdbc;

import java.sql.SQLException;

public interface IEmployeeServiceProvider {
    public boolean insertRecord(Employee empObj) throws DuplicateEmployeeIDException, SQLException;
    public Employee readRecord(int employeeID) throws EmployeeNotFoundException, SQLException;
    public boolean updateRecord(int employeeID, Double newSalary) throws EmployeeNotFoundException, SQLException;
    public boolean deleteRecord(int employeeID) throws  EmployeeNotFoundException, SQLException;
}