package Module15.grocerysystem;

import Module15.grocerysystem.products.exceptions.ExpiredProductAddedException;
import Module15.grocerysystem.products.FoodProduct;
import Module15.grocerysystem.products.NonFoodProduct;
import Module15.grocerysystem.products.Product;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GroceryInventory {

    public static void main(String[] args) {
        ProductDatabase inventory = new ProductDatabase();

        tryAddFoodProduct("Milk", 6.95, -1000000000, 5, inventory);
        tryAddFoodProduct("Cream", 12.95, 800000000, 3, inventory);
        tryAddFoodProduct("Cake", 18.00, 8000000000L, 20, inventory);

        NonFoodProduct p4 = new NonFoodProduct("Reol", 295.5, new String[]{"Bøg", "Maling"});
        inventory.addProduct(p4);

        NonFoodProduct p5 = new NonFoodProduct("Stol", 29.5, new String[]{"Plast", "Mere plast"});
        inventory.addProduct(p5);
        
        NonFoodProduct p6 = new NonFoodProduct("Samsung Galaxy S9", 7899.95, new String[]{"Snapdragon something something", "Ram", "Screen"});
        inventory.addProduct(p6);

        System.out.println("Total price: " + inventory.getTotalPrice() + "\n");
        System.out.println(inventory.printInventory());

        //Polymorph loop
        for (Product p : inventory.getProducts()) {
            System.out.println(p.toString());
        }
        
        inventory.removeExpiredFoods();
    }

    private static void tryAddFoodProduct(String name, double price, long expOffsetMs, int temp, ProductDatabase inventory) {
        try {
            FoodProduct fp = foodProductCreator(name, price, expOffsetMs, temp);
            inventory.addProduct(fp);
        } catch (ExpiredProductAddedException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private static FoodProduct foodProductCreator(String name, double price, long expOffsetMs, int temp) throws ExpiredProductAddedException {
        Date d = new Date();
        d.setTime(d.getTime() + expOffsetMs);
        return new FoodProduct(name, price, d, temp);
    }

}
