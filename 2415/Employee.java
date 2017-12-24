import java.io.Serializable;

public class Employee implements Serializable {
    private int employeeID;
    private String employeeName;
    private double salary;

    public Employee(int employeeID, String employeeName, double salary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.salary = salary;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (employeeID != employee.employeeID) return false;
        if (Double.compare(employee.salary, salary) != 0) return false;
        return employeeName != null ? employeeName.equals(employee.employeeName) : employee.employeeName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = employeeID;
        result = 31 * result + (employeeName != null ? employeeName.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}


