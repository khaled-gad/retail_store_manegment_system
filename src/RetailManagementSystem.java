import java.util.ArrayList;

public class RetailManagementSystem {
    // ArrayLists to store instances of objects
    private static ArrayList<Customer> customersList = new ArrayList<>();
    private static ArrayList<Employee> employeesList = new ArrayList<>();
    private static ArrayList<Transaction> transactionsList = new ArrayList<>();

    // Method to add a Customer to the customersList
    public static void addCustomerToList(Customer customer) {
        customersList.add(customer);
    }

    // Method to add an Employee to the employeesList
    public static void addEmployeeToList(Employee employee) {
        employeesList.add(employee);
    }
    public static void addTransaction(Transaction transaction){
        transactionsList.add(transaction);
    }

    // Display information for all customers
    public static void displayCustomers() {
        System.out.println("Customers:");
        for (Customer customer : customersList) {
            System.out.println(customer); // toString() is implicitly called
            System.out.println();
        }
    }

    // Display information for all employees
    public static void displayEmployees() {
        System.out.println("Employees:");
        for (Employee employee : employeesList) {
            System.out.println(employee); // toString() is implicitly called
            System.out.println();
        }
    }
    public static void displayTransactions(){
        System.out.println("Transactions:");
        for (Transaction transaction : transactionsList){
            System.out.println(transaction);
            System.out.println();

        }
    }
}
