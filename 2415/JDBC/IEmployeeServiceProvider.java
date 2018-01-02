package jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public interface IEmployeeServiceProvider {
    public boolean insertRecord(Employee empObj) throws DuplicateEmployeeIDException, SQLException, ClassNotFoundException, FileNotFoundException, IOException;
    public Object readRecord(int employeeID) throws EmployeeNotFoundException, SQLException, ClassNotFoundException, FileNotFoundException, IOException;
    public boolean updateRecord(int employeeID, Double newSalary) throws EmployeeNotFoundException, SQLException, ClassNotFoundException, FileNotFoundException, IOException;
    public boolean deleteRecord(int employeeID) throws  EmployeeNotFoundException, SQLException, ClassNotFoundException, FileNotFoundException, IOException;
}


