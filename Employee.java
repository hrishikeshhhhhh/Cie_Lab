public class Employee {
    private String name;
    private String empId;
    private double salary;

    public Employee(String name, String empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Hrishikesh", "EMP001", 60000);
        employee.displayEmployeeDetails();
    }
}
