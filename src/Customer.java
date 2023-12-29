public class Customer {
    private String customerId;
    private double averageBill;
    private int visitsPerMonth;

    public Customer(String customerId, double averageBill, int visitsPerMonth) {
        this.customerId = customerId;
        this.averageBill = averageBill;
        this.visitsPerMonth = visitsPerMonth;
    }

    // Accessors and Mutators

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getAverageBill() {
        return averageBill;
    }

    public void setAverageBill(double averageBill) {
        this.averageBill = averageBill;
    }

    public int getVisitsPerMonth() {
        return visitsPerMonth;
    }

    public void setVisitsPerMonth(int visitsPerMonth) {
        this.visitsPerMonth = visitsPerMonth;
    }

    // Display function
    @Override
    public String toString() {
        return "Customer ID: " + customerId + "\nAverage Bill: " + averageBill + "\nVisits Per Month: " + visitsPerMonth;
    }
}

