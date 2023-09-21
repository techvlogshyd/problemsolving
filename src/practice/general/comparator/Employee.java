package practice.general.comparator;

public class Employee implements Comparable<Employee>{
    private String empName;
    private int empSalary;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    private int empId;

    public Employee(String empName, int empSalary, int empId) {
        this.empName = empName;
        this.empSalary = empSalary;
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empId=" + empId +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.empId-o.empId;

    }
}
