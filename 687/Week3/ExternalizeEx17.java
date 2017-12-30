package com.java.io;
import java.io.Externalizable ;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectInput;

/**
 * Ex 17 - Externalization
 *  Create a class Employee with following fields  employeeID, employeeName, password, salary, deptNO  
 *  Create a unique collection of employees and count them based on the department number  and list the result. - Pending
 *  Serialize the above collection of employees into a file. 
 *  While serializing rotate the password by a number, 
 *  while deserializing rotate it in reverse, using the same number. - Pending
**/

class Employee implements Externalizable  {
   int empId;
   String empName;
   String empPwd;
   double salary;
   int deptNo;
  
 /**
 * 
 */
public Employee() {
	super();
	this.empId = 0;
	this.empName = "";
	this.empPwd = null;
	this.salary = 0;
	this.deptNo = 0;
}

/**
 * @param empId
 * @param empName
 * @param empPwd
 * @param salary
 * @param deptNo
 */
public Employee(int empId, String empName, String empPwd, double salary, int deptNo) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empPwd = empPwd;
	this.salary = salary;
	this.deptNo = deptNo;
}

/**
 * @return the empId
 */
public int getEmpId() {
	return empId;
}

/**
 * @param empId the empId to set
 */
public void setEmpId(int empId) {
	this.empId = empId;
}

/**
 * @return the empName
 */
public String getEmpName() {
	return empName;
}

/**
 * @param empName the empName to set
 */
public void setEmpName(String empName) {
	this.empName = empName;
}

/**
 * @return the empPwd
 */
public String getEmpPwd() {
	return empPwd;
}

/**
 * @param empPwd the empPwd to set
 */
public void setEmpPwd(String empPwd) {
	this.empPwd = empPwd;
}

/**
 * @return the salary
 */
public double getSalary() {
	return salary;
}

/**
 * @param salary the salary to set
 */
public void setSalary(double salary) {
	this.salary = salary;
}

/**
 * @return the deptNo
 */
public int getDeptNo() {
	return deptNo;
}

/**
 * @param deptNo the deptNo to set
 */
public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}

/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + empId;
	return result;
}

/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (empId != other.empId)
		return false;
	return true;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empPwd=" + empPwd + ", salary=" + salary
			+ ", deptNo=" + deptNo + "]";
}

	@Override
   public void writeExternal(ObjectOutput out) {
     try {
    // customize and serialize 
    	 out.writeInt(empId);
    	 out.writeObject(empName);
    	 out.writeObject(empPwd.substring(1,empPwd.length())+empPwd.substring(0,1));
    	 out.writeDouble(salary);
    	 out.writeInt(deptNo);
     }catch(Exception e) {
        System.out.println(e.toString());
     }
   }
   
   @Override
   public void readExternal(ObjectInput in) {
    try{       
    	// reading customized serialized data 
       empId = in.readInt();	
       empName = (String)in.readObject();
       empPwd = (String)in.readObject();

       salary = in.readDouble();
       deptNo = in.readInt();
      }catch(Exception e) {
      System.out.println(e.toString());
    }
   }
}

public class ExternalizeEx17 {

   public static void main(String[] args) 
      throws IOException, ClassNotFoundException {
	 
	 ArrayList<Employee> empList = new ArrayList<Employee>();
     Employee e1,e2;
     e1 = new Employee(101,"Jennie","blackdoll",1000,01);
	 empList.add(e1);
     e1 = new Employee(102,"Pam","whitecrow",2000,01);
	 empList.add(e1);
     e1 = new Employee(103,"Marilyn","greyhorse",2500,02);
	 empList.add(e1);
     e1 = new Employee(104,"Matt","treedark",3000,02);
	 empList.add(e1);
     e1 = new Employee(105,"Joel","skygreen",4000,03);
	 empList.add(e1);
     e1 = new Employee(106,"Taylor","seahorse",5500,03);
	 empList.add(e1);

     System.out.println(e1);
    
     ObjectOutputStream obOut = 
        new ObjectOutputStream(new FileOutputStream("employee.dat"));
     obOut.writeObject(e1);// serialize 
     obOut.close();
        
    ObjectInputStream obIn = 
        new ObjectInputStream(new FileInputStream("employee.dat"));
    e2 = (Employee)obIn.readObject();       // deserialize 
    System.out.println(e2);
    obIn.close();
  }

}