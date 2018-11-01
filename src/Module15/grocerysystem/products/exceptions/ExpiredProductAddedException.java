package Module15.grocerysystem.products.exceptions;

public class ExpiredProductAddedException extends Exception {

    public ExpiredProductAddedException() {
        super("Attempted to add expired product to database");
    }
}
