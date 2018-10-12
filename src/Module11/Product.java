package Module11;

/**
 *
 * @author Nicolai Gram
 */
public class Product {

    private static int nextNumber = 0;
    private int number;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.number = nextNumber;
        nextNumber++;
        this.name = name;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Product) {
            return getNumber() == ((Product)obj).getNumber();
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return 
                "Name: " + getName();
    }
    
    

}
