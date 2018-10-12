package Module11;

import java.util.ArrayList;

/**
 *
 * @author Nicolai Gram
 */
public class ProductDatabase {

    private ArrayList<Product> productList;

    public ProductDatabase() {
        productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProducts() {
        return productList;
    }

    public Product getProduct(int productNumber) {
        Product foundProduct = null;

        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            if (p.getNumber() == productNumber) {
                foundProduct = p;
            }
        }

        return foundProduct;
    }

    public void addProduct(Product p) {
        productList.add(p);

        System.out.printf("Product \"%s\" was added. There are now %d products in the database.%n", p.getName(), productList.size());

    }

    public void removeProduct(int productNumber) {
        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            if (p.getNumber() == productNumber) {
                productList.remove(p);
                System.out.printf("Product \"%s\" was removed. There are now %d products in the database.%n", p.getName(), productList.size());
            }
        }
    }

//    public void printProducts() {
//        for (int i = 0; i < productList.size(); i++) {
//            Product p = productList.get(i);
//            System.out.printf("%s [%s] %s%n", p.getName(), p.getNumber(), Currency.format(p.getPrice()));
//        }
//    }
    
    public void printProducts() {
        for (Product p : productList) {
            System.out.println(p.toString());
        }
    }

    public double getValue() {
        double value = 0;
        for (int i = 0; i < productList.size(); i++) {
            value += productList.get(i).getPrice();
        }
        return value;
    }

    public void removeProduct(Product p) {
        if (productList.contains(p)) {
            productList.remove(p);
            System.out.printf("Product \"%s\" was removed. There are now %d products in the database.%n", p.getName(), productList.size());

        } else {
            System.out.printf("Product \"%s\" was NOT found in the database. There are currently %d products in the database.%n", p.getName(), productList.size());
        }
    }
}
