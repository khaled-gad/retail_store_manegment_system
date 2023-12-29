public class Manager extends Employee {
    public Manager(String employeeId, String employeeName) {
        super(employeeId, employeeName, "Manager");
    }

    @Override
    public void performDuties() {
        System.out.println("Managing overall store operations and staff.");
    }

    // Additional methods specific to Manager, if needed
}
