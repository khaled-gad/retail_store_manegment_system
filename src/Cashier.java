public class Cashier extends Employee {
    public Cashier(String employeeId, String employeeName) {
        super(employeeId, employeeName, "Cashier");
    }

    @Override
    public void performDuties() {
        System.out.println("Processing transactions at the checkout.");
    }
    public void selltocustomer(Customer customer){
        
    }

    // Additional methods specific to Cashier, if needed
}
