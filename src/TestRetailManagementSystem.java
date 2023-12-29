public class TestRetailManagementSystem {
    public static void main(String[] args) {
        // Create instances of Customer and Employee
        Customer customer1 = new Customer("C001", 50.0, 2);
        Cashier cashier1 = new Cashier("E001", "Alice Cashier");
        Transaction transaction1 = new Transaction(cashier1, customer1, 69);

        // Add instances to the RetailManagementSystem
        RetailManagementSystem.addCustomerToList(customer1);
        RetailManagementSystem.addEmployeeToList(cashier1);
        RetailManagementSystem.addTransaction(transaction1);

        // Display information for all customers and employees
        RetailManagementSystem.displayCustomers();
        RetailManagementSystem.displayEmployees();
        RetailManagementSystem.displayTransactions();
    }
}
