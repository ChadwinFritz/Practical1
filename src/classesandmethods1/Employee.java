package classesandmethods1;

public class Employee {

    private String empName;
    private String empSurname;
    private String empNumber;
    private double empSalary;

    public Employee() {
        this.empName = "xxxx";
        this.empSurname = "----";
        this.empNumber = "0";
        this.empSalary = 0;
    }

    public Employee(String empName, String empSurname, String empNumber, double empSalary) {
        this.empName = empName;
        this.empSurname = empSurname;
        this.empNumber = empNumber;
        this.empSalary = empSalary;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public double getEmpSalary() {
        return empSalary;
    }
    
    public void increaseSalary(double empIncrease){
        this.empSalary += (this.empSalary * (empIncrease/100));
    }

    @Override
    public String toString() {
        return "empName = " + empName + ", empSurname = " + empSurname + ", empNumber = " + empNumber + ", empSalary = R" + empSalary;
    }

}
