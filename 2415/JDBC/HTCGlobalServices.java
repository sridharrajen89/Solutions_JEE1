package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HTCGlobalServices implements IEmployeeServiceProvider {
	
	Connection con;
    
	public HTCGlobalServices(Connection con) {
		//Default Constructor 
		super();
		this.con=con;
	}
	
public  boolean  insertRecord(Employee emp) throws DuplicateEmployeeIDException, SQLException{
	// Insert the records to the employee table. 
	
    int empid=emp.getEmployeeID();     
    CallableStatement statement=con.prepareCall("{call readRecord(?)}");
    statement.setInt(1,empid);
    ResultSet rs=statement.executeQuery();   
    if (!rs.next()) {
    	CallableStatement statement1=con.prepareCall("{call insertRecord(?,?,?)}");
        statement1.setInt(1, empid);
        statement1.setString(2, emp.getEmployeeName());
        statement1.setDouble(3, emp.getSalary());
        int insertCount=statement1.executeUpdate(); 
        if (insertCount==0)
        System.out.println("Record has been inserted");        
    	return true;
    }
    throw new DuplicateEmployeeIDException();
}

@Override
public Employee readRecord(int employeeID) throws EmployeeNotFoundException, SQLException {
	// Read the employee details for the given employee ID

	CallableStatement statement=con.prepareCall("{call readRecord(?)}");
    statement.setInt(1,employeeID);
    ResultSet rs=statement.executeQuery();
    if (rs.next()) {
    	PreparedStatement statement1= null;
        statement1 = con.prepareStatement("SELECT * FROM READRECORD("+employeeID+")");  
        ResultSet rs1=statement1.executeQuery();
        Employee emp = new Employee(); 

        while (rs1.next())	{
        	emp.setEmployeeID(rs1.getInt(1));
            emp.setEmployeeName(rs1.getString(2));
            emp.setSalary(rs1.getDouble(3));
        	return emp;
        }
        throw new EmployeeNotFoundException("Employee Not Found to read for the ID: "+ employeeID);
    }   
    throw new EmployeeNotFoundException("Employee Not Found to read for the ID: "+ employeeID);
}


@Override
public boolean updateRecord(int employeeID, Double newSalary) throws EmployeeNotFoundException, SQLException {
	// Update the salary details for the given employee ID
    
    CallableStatement statement=con.prepareCall("{call readRecord(?)}");
    statement.setInt(1,employeeID);
    ResultSet rs=statement.executeQuery();  
    if (rs.next()) {
    	CallableStatement statement1=con.prepareCall("{call updateRecord(?,?)}");
        statement1.setInt(1,  employeeID);
        statement1.setDouble(2, newSalary);
        int updateCount=statement1.executeUpdate();// actual execution happens 
        if (updateCount==0)
        System.out.println("Record has been updated");            
        return true;
    }
    throw new EmployeeNotFoundException("Employee Not Found to update the salary for the ID: "+employeeID);
}

@Override
public boolean deleteRecord(int employeeID) throws EmployeeNotFoundException, SQLException {
	// Delete the record for the given employee ID
	
    CallableStatement statement=con.prepareCall("{call readRecord(?)}");
    statement.setInt(1,employeeID);
    ResultSet rs=statement.executeQuery();   
    if (rs.next()) {
    	CallableStatement statement1=con.prepareCall("{call deleteRecord(?)}");
        statement1.setInt(1,  employeeID);  
        int deleteCount=statement1.executeUpdate();
        if (deleteCount==0)
        System.out.println("Record has been Deleted");  
    	return true;
    }
    throw new EmployeeNotFoundException("Employee Not Found to delete for the ID: "+employeeID);
}
}
