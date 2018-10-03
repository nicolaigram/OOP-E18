package Module09;

import java.util.Arrays;

/**
 *
 * @author Nicolai Gram
 */
public class ProductDatabase {

    private Product[] products;
    private int productCount;

    public ProductDatabase() {
        products = new Product[1];
        productCount = 0;
    }

    public Product[] getProducts() {
        return products;
    }
    
    public Product getProduct(int productNumber) {
        Product p = null;
        
        for (int i = 0; i < productCount; i++) {
            if (products[i].getNumber() == productNumber) {
                p = products[i];
            }
        }
        
        return p;
    }

    public void addProduct(Product p) {
        products[productCount] = p;
        
        productCount++;
        
        System.out.printf("Product \"%s\" was added. There are now %d products in the database.%n", p.getName(), productCount);

        if (productCount >= products.length) {                          // If array if full
            products = Arrays.copyOf(products, products.length * 2);    // Double the size of array.
        }
    }

    public void removeProduct(int productNumber) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getNumber() == productNumber) {
                handleRemove(i);
            }
        }
    }

    private void handleRemove(int index) {
        Product p = products[index]; // Variable for printing out the string in the end
        if (index < productCount - 1) {
            swapLastIndex(index);
        } else {
            setProductNull(index);
        }
        productCount--;
        System.out.printf("Product \"%s\" was removed. There are now %d products in the database.%n", p.getName(), productCount);
    }

    private void swapLastIndex(int index) {
        products[index] = products[productCount - 1];
    }

    private void setProductNull(int index) {
        products[index] = null;
    }

    public void printProducts() {
        for (int i = 0; i < productCount; i++) {
            Product p = products[i];
            System.out.printf("%s [%s] %s%n", p.getName(), p.getNumber(), Currency.format(p.getPrice()));
        }
    }
    
    public double getValue() {
        double value = 0;
        for (int i = 0; i < productCount; i++) {
            value += products[i].getPrice();
        }
        return value;
    }

}
