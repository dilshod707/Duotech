package OOP;

public class Employee {

    private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;


    public Employee(int employeeId, String firstName, String lastName, String department, double annualSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.annualSalary = annualSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void raiseSalary(double percent){
        annualSalary = annualSalary + (annualSalary*percent);
    }

}
