package Module09;

/**
 *
 * @author Nicolai Gram
 */
public class Currency {
    public static String format(double num) {
        return String.format("%.2f %s", num, "kr.");
    }
}
