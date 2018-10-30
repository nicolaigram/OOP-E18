package Module15.Exceptions;

public class ExpiredProductAddedException extends Exception {

    public ExpiredProductAddedException() {
        super("Attempted to add expired product to database");
    }
}
