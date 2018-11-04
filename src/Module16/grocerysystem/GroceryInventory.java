package Module16.grocerysystem;

import Module16.grocerysystem.exceptions.ExpiredProductAddedException;
import Module16.grocerysystem.products.FoodProduct;
import Module16.grocerysystem.products.NonFoodProduct;
import Module16.grocerysystem.products.Product;
import java.util.Date;

public class GroceryInventory {

    public static void main(String[] args) {
        ProductDatabase inventory = new ProductDatabase();
        try {

            FoodProduct p2 = foodProductCreator("Cream", 12.95, 800000000, 3);
            inventory.addProduct(p2);
            FoodProduct p3 = foodProductCreator("Cake", 18.00, 8000000000L, 20);
            inventory.addProduct(p3);
            FoodProduct p1 = foodProductCreator("Milk", 6.95, -1000000000, 5);
            inventory.addProduct(p1);
        } catch (ExpiredProductAddedException ex) {
            System.out.println("Attempted to add expired product.");
        }

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
        
        System.out.println("\nSorting by name length: ");
        for (Product p : inventory.sortedByNameLength()) {
            System.out.println(p.toString());
        }
        
        System.out.println("\nSorting by price: ");
        for (Product p : inventory.sortedByPrice()) {
            System.out.println(p.toString());
        }
        
    }

    private static FoodProduct foodProductCreator(String name, double price, long expOffsetMs, int temp) throws ExpiredProductAddedException {
        Date d = new Date();
        d.setTime(d.getTime() + expOffsetMs);
        return new FoodProduct(name, price, d, temp);
    }

}
