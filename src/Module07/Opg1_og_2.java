package Module07;

public class Opg1_og_2 {

    public static void main(String[] args) {

        /*OPGAVE 1*/
        System.out.println("Opgave 1: \n");
        Customer aCustomer = new Customer("Benny", 0);
        aCustomer.deposit(500);
        aCustomer.withdraw(50);
        System.out.println(aCustomer.getBalance());

        /*OPGAVE 2*/
        System.out.println("\n\nOpgave 2: \n");
        CustomerDatabase db = new CustomerDatabase();

        db.addCustomer(aCustomer);
        db.addCustomer(new Customer("John", 1, 372));
        db.addCustomer(new Customer("Irene", 2, 2392));
        db.addCustomer(new Customer("Finn", 3, 600));

        db.removeCustomer(2);

        System.out.println("");
        db.printCustomers();
    }
}
