package Module7;

public class Customer {

    
    private String name;
    private int id;
    private double balance;

    /**
     * This constructor sets the default balance to 0;
     * @param name Full name of the customer
     * @param id Id of the customer
     */
    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
        this.balance = 0;
    }

    /**
     * This constructor sets the default balance to a given amount.
     * @param name Full name of the customer
     * @param id Id of the customer
     * @param balance Initial balance of the customer
     */
    public Customer(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    /**
     * Add any amount to the customers balance.
     * @param amount
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Reduce the customers balance. Only if given amount is less than the customers balance.
     * @param amount 
     */
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    /**
     * 
     * @return The customers balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * 
     * @return The customers full name.
     */
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
            

    
    
}
