package Module7;

public class CustomerDatabase {

    private Customer[] customerArray;
    private int customersCount;

    public CustomerDatabase() {
        customerArray = new Customer[50]; // Need to set array size to something
        customersCount = 0;
    }

    /**
     * Will add a customer to the array, if the array limit has not been
     * reached. If the limit has been reached, it will print an error message in
     * the console.
     *
     * @param customer Object of type Customer
     */
    public void addCustomer(Customer customer) {
        if (customersCount < customerArray.length) { // If array is NOT full
            customerArray[customersCount] = customer;
            customersCount++;
            System.out.println("Customer " + customer.getName() + " was added!");
        } else { // If array IS full
            System.out.println("Max customers reached!");
        }
    }

    /**
     * This method will set the reference of a given Customer ID in the array to null.
     * It will also decrease the customerCount variable. At last, it will
     * iterate through the array, and move all items left by calling another function, so there is no null
     * reference in between objects.
     *
     * @param id Id of the Customer in the array you want to remove.
     */
    public void removeCustomer(int id) {
        for (Customer customer : customerArray) {
            if (customer.getId() == id) {
                System.out.printf("Removing customer (Id: %d, Name: %s)%n", id, customer.getName());
                customerArray[id] = null;
                customersCount--;
                break;
            }
        }
        orderArray(); // Move all null to the right
    }

    /**
     * Will make sure there are no gaps (with null) in between Customers in the
     * array.
     */
    private void orderArray() {
        for (int i = 0; i < customersCount; i++) {
            if (customerArray[i] == null) { // If we find a position in the array with null
                customerArray[i] = customerArray[i + 1]; // Move customer from right to left
                customerArray[i + 1] = null;             // Set null on the position to the right
            }
        }
    }

    /**
     * Get all customers.
     *
     * @return An array of customers.
     */
    public Customer[] getCustomers() {
        return customerArray;
    }

    /**
     * Will print each customer and their respective balance
     */
    public void printCustomers() {
        for (int i = 0; i < customersCount; i++) {
            Customer c = customerArray[i];
            System.out.println(c.getName() + ", " + c.getBalance());
        }
    }
}
