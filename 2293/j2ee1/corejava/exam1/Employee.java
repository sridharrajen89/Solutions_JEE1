package j2ee1.corejava.exam1;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.text.NumberFormat;
import java.text.ParseException;

public class Employee  implements Externalizable{

	public Employee() {
		super();
	}
	
	public Employee(int empId, String empName, String gender, double salary, String job) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.salary = salary;
		this.job = job;
	}

	int empId;
	String empName;
	transient String gender;
	double salary;
	String job;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + NumberFormat.getCurrencyInstance().format(salary)
				+ ", job=" + job + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(empId);
		if(gender.equalsIgnoreCase("male")) {
			out.writeUTF("Mr. "+empName);
		}else
			out.writeUTF("Ms. "+empName);
		
		out.writeUTF(NumberFormat.getCurrencyInstance().format(salary));
		out.writeUTF(job);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		empId=in.readInt();
		empName=in.readUTF();
		try {
			salary = ((Long) NumberFormat.getCurrencyInstance().parse(in.readUTF())).doubleValue();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		job = in.readUTF();
	}
	
	
}
