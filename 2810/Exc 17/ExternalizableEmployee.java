package com.htc.Exc2;

import java.io.Externalizable ;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectInput;
import java.util.ArrayList;

class Employeee implements Externalizable  {
   int employeeID;
   String employeeName;
   String password;
   double salary;
   int deptNO;
  
  
   public Employeee() {
	super();
	this.employeeID = 0;
	this.employeeName = null;
	this.password = null;
	this.salary = 0.0;
	this.deptNO = 0;
}
   
   public Employeee(int employeeID, String employeeName, String password, double salary, int deptNO) {
	super();
	this.employeeID = employeeID;
	this.employeeName = employeeName;
	this.password = password;
	this.salary = salary;
	this.deptNO = deptNO;
}

public int getEmployeeID() {
	return employeeID;
}

public void setEmployeeID(int employeeID) {
	this.employeeID = employeeID;
}

public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public int getDeptNO() {
	return deptNO;
}

public void setDeptNO(int deptNO) {
	this.deptNO = deptNO;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + employeeID;
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
	Employeee other = (Employeee) obj;
	if (employeeID != other.employeeID)
		return false;
	return true;
}

@Override
public String toString() {
	return "Employeee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", password=" + password
			+ ", salary=" + salary + ", deptNO=" + deptNO + "]";
}

@Override
   public void writeExternal(ObjectOutput out) {
     try {
    // customize and serialize 
         out.writeObject((password.substring(password.length() - 1)) + (password.substring(0, password.length() - 1 )));
    	 out.writeObject(employeeName);
    	 out.writeObject(employeeID);
    	 out.writeObject(deptNO);
    	 out.writeObject(salary);
     }catch(Exception e) {
        System.out.println(e.toString());
     }
   }
   
   @Override
   public void readExternal(ObjectInput in) {
    try{
    	// reading customized serialized data 
 	       password = (String)in.readObject();
 	       employeeName = (String)in.readObject();
 	       employeeID = (int)in.readObject();
 	       deptNO = (int)in.readObject();
 	       salary = (double)in.readObject();
    }catch(Exception e) {
      System.out.println(e.toString());
    }
   }
}

public class ExternalizableEmployee {

   public static void main(String[] args) 
     throws IOException, ClassNotFoundException {
	 
	 ArrayList<Employeee> elist = new ArrayList<Employeee>();
	 
     Employeee e1,e2;
     e1 = new Employeee(105,"UdayaPandian","1238",5000.00,400);
     elist.add(e1);
     System.out.println(e1);
    
     ObjectOutputStream obOut = 
     new ObjectOutputStream(new FileOutputStream("employee.dat"));
     obOut.writeObject(e1);// serialize 
     obOut.close();
        
    ObjectInputStream obIn = 
        new ObjectInputStream(new FileInputStream("employee.dat"));
    e2 = (Employeee)obIn.readObject();       // deserialize 
    System.out.println(e2);
    obIn.close();
  }

}