public class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(String name, String empId, double salary, double bonus) {
        super(name, empId, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + (getSalary() + bonus));
    }

    public static void main(String[] args) {
        DevOpsEngineer devOpsEngineer = new DevOpsEngineer("Hrishikesh", "EMP002", 70000, 5000);
        devOpsEngineer.displayEmployeeDetails();
    }
}
