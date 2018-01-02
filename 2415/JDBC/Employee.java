package jdbc;

import java.io.Serializable;

public class Employee implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int employeeID;
    private String employeeName;
    private double salary;

    public Employee(int employeeID, String employeeName, double salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public Employee() {
		// TODO Auto-generated constructor stub
		super();
		this.employeeID = 0;
		this.employeeName = "";
		this.salary = 0;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeID != other.employeeID)
			return false;
		return true;
	}

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeID;
		return result;
	}

    @Override
    public String toString() {
        return "ArrayListExample.Employee{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
