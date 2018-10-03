package Module09;

import java.util.Date;

/**
 *
 * @author Nicolai Gram
 */
public class Start {
    public static void main(String[] args) {
        
        /* OPGAVE 1 */
        System.out.println("[OPGAVE 1]\n");
        ProductDatabase db = new ProductDatabase();
        db.addProduct(new Product(1, "Rugbrød", 20.2));
        db.addProduct(new Product(24, "Leverpostej", 13.4));
        db.addProduct(new Product(173, "Bacon", 7.5));
        
        db.removeProduct(24);
        
        db.printProducts();
        
        System.out.println("\nTotal database value is: " + Currency.format(db.getValue()));
        
        /* OPGAVE 2 */
        System.out.println("\n[OPGAVE 2]\n");
        db.addProduct(new NonfoodProduct(62, "Toy Gun", 5.50, new String[]{"Plastic", "Paint", "Metal"}));
        db.addProduct(new ColonialProduct(92, "Curry", 5.50, new Date(118, 11, 24), 20)); // 2018 December 24
        
        /* OPGAVE 3 */
        System.out.println("\n[OPGAVE 3]\n");
        System.out.println(db.getProduct(62).toString());
        System.out.println(db.getProduct(92).toString());
        
    }
}
