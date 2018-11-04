package Module16.grocerysystem.products;

import java.util.Comparator;

/**
 *
 * @author Nicolai Gram
 */
public class ProductNameLengthComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().length() - o2.getName().length();
    }
}
