package test.com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO implements IEmployeeServiceProvider {
		
	Connection con;
	public EmpDAO(Connection con) {
		super();
		this.con = con;
	}

		@Override
		public boolean insertRecord(Empcrud emp) throws DuplicateEmployeeException, SQLException {
			
			boolean insrtresult=false;
			int empno=emp.getEmployeeNumber();
			String empname=emp.getEmployeeName();
			double empsal=emp.getEmployeeSalary();
			
					
			CallableStatement insrtstmt=con.prepareCall("{ call insrt_employees(?,?,?)}"); 
			insrtstmt.setInt(1, empno);
			insrtstmt.setString(2, empname);
			insrtstmt.setDouble(3, empsal);
			
			int insrtcount=insrtstmt.executeUpdate(); //execution of SP happens
			
			System.out.println(insrtcount);
			if (insrtcount==0) {
				insrtresult=true;								
				return insrtresult;
			}
			
			throw new DuplicateEmployeeException("Emp record already exist");
						
		}

		@Override
		public Empcrud readRecord(int employeeno) throws EmployeeNotFndException, SQLException {
			
			int empno=employeeno;
			CallableStatement readstmt=con.prepareCall("{ call read_employee(?)}");
			readstmt.setInt(1, empno);
			ResultSet rs=readstmt.executeQuery(); 
			
			if (rs.next()) {
				empno=rs.getInt(1);
				String empname=rs.getString(2);
				double empsal=rs.getDouble(3);
				return new Empcrud(empno,empname,empsal);
			}
			else
				throw new EmployeeNotFndException("Emp record is not found");
				
		}

		@Override
		public boolean updateRecord(int employeeno,double employeesal) throws EmployeeNotFndException, SQLException{
			
			boolean updtresult=false;
			int empno=employeeno;
			double empsal=employeesal;
			
			CallableStatement updtstmt=con.prepareCall("{ call updt_employees(?,?)}"); 
			updtstmt.setInt(1, empno);
			updtstmt.setDouble(2, empsal);
			
			int updtcount=updtstmt.executeUpdate(); //execution of SP happens
			
			System.out.println(updtcount);
			if (updtcount==0) {
				updtresult=true;								
				return updtresult;
			}
			else
			   throw new EmployeeNotFndException("Emp record already exist");
			
		}

		@Override
		public boolean deleteRecord (int employeeno) throws EmployeeNotFndException, SQLException{
			
			boolean dltresult=false;
			int empno=employeeno;
			
			CallableStatement dltstmt=con.prepareCall("{ call dlt_employee(?)}"); 
			dltstmt.setInt(1, empno);
			
			int dltcount=dltstmt.executeUpdate();
			
			System.out.println(dltcount);
			if (dltcount==0) {
				dltresult=true;								
				return dltresult;
			}
			else
			
			throw new EmployeeNotFndException("Emp record already exist");
						
			
		}
		


}
