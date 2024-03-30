import java.text.ParseException;

public class EmployeeDetails extends Person {
    private String empId;
    private double salary;

    public EmployeeDetails(String name, String dob, String empId, double salary) throws ParseException {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayName();
        displayAge();
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) throws ParseException {
        EmployeeDetails employee = new EmployeeDetails("Hrishikesh", "24-07-2000", "EMP001", 50000);
        employee.displayEmployeeDetails();
    }
}
