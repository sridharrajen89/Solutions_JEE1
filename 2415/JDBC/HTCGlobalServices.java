package jdbc;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HTCGlobalServices implements IEmployeeServiceProvider {
	
	private int companyID;
	private String companyName;
    private String companyEmailId;    
    private Employee empObj;
    DBConnector dbc=new DBConnector();
    
   
	public HTCGlobalServices(int companyID, String companyName, String companyEmailId, Employee empObj) {
		super();
		this.companyID = companyID;
		this.companyName = companyName;
		this.companyEmailId = companyEmailId;
		this.empObj = empObj;
	}

	@Override
	public String toString() {
		return "HTCGlobalServices [companyID=" + companyID + ", companyName=" + companyName + ", companyEmailId="
				+ companyEmailId + ", empObj=" + empObj + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyEmailId == null) ? 0 : companyEmailId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HTCGlobalServices other = (HTCGlobalServices) obj;
		if (companyEmailId == null) {
			if (other.companyEmailId != null)
				return false;
		} else if (!companyEmailId.equals(other.companyEmailId))
			return false;
		return true;
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

	public Employee getEmpObj() {
		return empObj;
	}

	public void setEmpObj(Employee empObj) {
		this.empObj = empObj;
	}

	
	
public  boolean  insertRecord(Employee emp) throws DuplicateEmployeeIDException, SQLException, ClassNotFoundException, FileNotFoundException, IOException {
	boolean result=false;
    int empid=emp.getEmployeeID();
    
    // similarly for name and salary   
    Connection con = dbc.getConnection();
    CallableStatement statement=con.prepareCall("{call readRecord(?)}");
    statement.setInt(1,empid);
    ResultSet rs=statement.executeQuery();   
    //int count = rs.getInt(0);
    //System.out.println(count);
    //System.out.println("  rs.next(): "+ rs.next());
    if (!rs.next()) {
    	//System.out.println("rs.next()1: " + rs.next());
    	CallableStatement statement1=con.prepareCall("{call insertRecord(?,?,?)}");
        statement1.setInt(1, empid);
        statement1.setString(2, emp.getEmployeeName());
        statement1.setDouble(3, emp.getSalary());
        int insertCount=statement1.executeUpdate(); 
        System.out.println("insertCount: "+insertCount);
        result  = true;
    	return false;
    }
    throw new DuplicateEmployeeIDException();
}

@Override
public Object readRecord(int employeeID) throws EmployeeNotFoundException, SQLException, ClassNotFoundException, FileNotFoundException,IOException {
	// TODO Auto-generated method stub
   
    Connection con = dbc.getConnection();
	CallableStatement statement=con.prepareCall("{call readRecord(?)}");
    statement.setInt(1,employeeID);
    // execute the stored procedure
    ResultSet rs=statement.executeQuery();
    //from result set retrieve the employee record
    //Employee emp = new Employee(); 

    while (rs.next())	{	
        //System.out.println("rs.getInt: "+ rs.getObject(1));
        //emp.setEmployeeName(rs.getString(1));
    	return rs.getObject(1);
    }
    throw new EmployeeNotFoundException("Employee Not Found to read for the ID: "+ employeeID);
}

@Override
public boolean updateRecord(int employeeID, Double newSalary) throws EmployeeNotFoundException, SQLException, ClassNotFoundException, FileNotFoundException, IOException {
	// TODO Auto-generated method stub
    
    boolean result = false;   
    Connection con = dbc.getConnection();
    CallableStatement statement=con.prepareCall("{call readRecord(?)}");
    statement.setInt(1,employeeID);
    ResultSet rs=statement.executeQuery();  
    if (rs.next()) {
    	CallableStatement statement1=con.prepareCall("{call updateRecord(?,?)}");
        statement1.setInt(1,  employeeID);
        statement1.setDouble(2, newSalary);
        int updateCount=statement1.executeUpdate();// actual execution happens 
        System.out.println("updateCount: "+updateCount);
        result=true;
        return result;
    }
    throw new EmployeeNotFoundException("Employee Not Found to update the salary for the ID: "+employeeID);
}

@Override
public boolean deleteRecord(int employeeID) throws EmployeeNotFoundException, SQLException, ClassNotFoundException, FileNotFoundException, IOException {
	// TODO Auto-generated method stub
	boolean result = false;   
    Connection con = dbc.getConnection();
    CallableStatement statement=con.prepareCall("{call readRecord(?)}");
    statement.setInt(1,employeeID);
    ResultSet rs=statement.executeQuery();   
    if (rs.next()) {
    	CallableStatement statement1=con.prepareCall("{call deleteRecord(?)}");
        statement1.setInt(1,  employeeID);    
        int deleteCount=statement1.executeUpdate();// actual execution happens 
        System.out.println("deleteCount: " + deleteCount);   
        result = true;
    	return result;
    }
    throw new EmployeeNotFoundException("Employee Not Found to delete for the ID: "+employeeID);
}
}
