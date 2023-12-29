public abstract class Employee {
    private String employeeId;
    private String employeeName;
    private String role;

    public Employee(String employeeId, String employeeName, String role) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.role = role;
    }

    // Accessors and Mutators

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Abstract method to be implemented by subclasses
    public abstract void performDuties();

    // Display function
    @Override
    public String toString() {
        return "Employee ID: " + employeeId + "\nEmployee Name: " + employeeName + "\nRole: " + role;
    }
}
