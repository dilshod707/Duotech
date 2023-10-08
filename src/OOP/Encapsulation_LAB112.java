package OOP;

public class Encapsulation_LAB112 {

    @Override
    public String toString() {
        return "Encapsulation_LAB112{}";
    }

    public static void main(String[] args) {

        Employee worker = new Employee(1,"Chris", "Tucker", "Fleet", 55000);

        worker.setDepartment("Dispatch");
        worker.setEmployeeId(1);
        worker.raiseSalary(.20);

        System.out.println("Current Salary  of Chris after raise: " + worker.getAnnualSalary());
        System.out.println("Current Department: " + worker.getDepartment());









    }
}
