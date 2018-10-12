package Module11;

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
        db.addProduct(new Product("Rugbrød", 20.2));
        db.addProduct(new Product("Leverpostej", 13.4));
        db.addProduct(new Product("Bacon", 7.5));
        
        db.removeProduct(24);
        
        db.printProducts();
        
        System.out.println("\nTotal database value is: " + Currency.format(db.getValue()));
        
        /* OPGAVE 2 */
        System.out.println("\n[OPGAVE 2]\n");
        db.addProduct(new NonfoodProduct("Toy Gun", 5.50, new String[]{"Plastic", "Paint", "Metal"}));
        db.addProduct(new ColonialProduct("Curry", 5.50, new Date(118, 11, 24), 20)); // 2018 December 24
        
        /* OPGAVE 3 */
        System.out.println("\n[OPGAVE 3]\n");
        System.out.println(db.getProduct(4).toString());
        System.out.println(db.getProduct(3).toString());
        
        
        
        /* Modul 11 */
        System.out.println("\n\n-- MODUL 11--");
        
        /* Opgave 2 */
        System.out.println("\n[Opgave 2]\n");
        System.out.println(db.getProduct(1).equals(db.getProduct(2)));

        
        /* Opgave 3 */
        System.out.println("\n[Opgave 3]\n");
        NonfoodProduct nonFoodProd = new NonfoodProduct("Coffee Mug", 3.75, new String[]{"Cheramics"});
        db.addProduct(nonFoodProd);
        db.removeProduct(new Product("Milk", 4.00));
        db.removeProduct(nonFoodProd);
        
        /* Opgave 4 */
        System.out.println("\n[Opgave 4]\n");
        ProductDatabase db2 = new ProductDatabase();
        db.addProduct(new ColonialProduct("Orange Juice", 2.75, new Date(118, 9, 28), 5));
        db.addProduct(new ColonialProduct("Chocolate Bar", 3.00, new Date(118, 9, 20), 5));
        db.addProduct(new ColonialProduct("Cereal", 2.75, new Date(118, 10, 21), 5));
        
        db.addProduct(new NonfoodProduct("Hat", 30.50, new String[]{"Linen", "Plastic"}));
        db.addProduct(new NonfoodProduct("Leather Boots", 80.00, new String[]{"Leather", "Rubber"}));
        db.addProduct(new NonfoodProduct("Workbook", 2.00, new String[]{"Paper", "Metal"}));
        
        System.out.println("");
        db.printProducts();
    }
}
