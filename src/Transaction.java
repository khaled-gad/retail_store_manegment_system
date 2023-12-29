import java.util.Date;

public class Transaction {
    private Cashier cashier;
    private Customer customer;
    private Date date;
    private double price;

    public Transaction(Cashier cashier, Customer customer, double price) {
        this.cashier = cashier;
        this.customer = customer;
        this.date = new Date(); 
        this.price = price;
    }

    // Accessors and Mutators

    public Cashier getCashier() {
        return cashier;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Transaction Details:\n" +
                "Cashier: " + cashier.getEmployeeName() +
                "\nCustomer: "+customer.getCustomerId()+
                "\nDate: " + date +
                "\nPrice: $" + price;
    }
}
