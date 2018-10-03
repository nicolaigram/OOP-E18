package Module09;

import java.util.Arrays;

/**
 *
 * @author Nicolai Gram
 */
public class NonfoodProduct extends Product {
    
    private String[] materials;

    public NonfoodProduct(int number, String name, double price, String[] materials) {
        super(number, name, price);
        this.materials = materials;
    }

    @Override
    public String toString() {
        return 
                "Name: " + super.getName() +
                ", materials: " + Arrays.toString(materials);
    }
}
