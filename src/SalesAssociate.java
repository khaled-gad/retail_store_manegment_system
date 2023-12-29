public class SalesAssociate extends Employee {
    public SalesAssociate(String employeeId, String employeeName) {
        super(employeeId, employeeName, "Sales Associate");
    }

    @Override
    public void performDuties() {
        System.out.println("Assisting customers with product inquiries and purchases.");
    }

    // Additional methods specific to Sales Associate, if needed
}
