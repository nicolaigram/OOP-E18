package Module09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nicolai Gram
 */
public class ColonialProduct extends Product {
    
    private Date expirationDate;
    private int storageTemperature;
    
    public ColonialProduct(int number, String name, double price, Date expirationDate, int storageTemperature) {
        super(number, name, price);
        this.expirationDate = expirationDate;
        this.storageTemperature = storageTemperature;
    }

    @Override
    public String toString() {
        return 
                "Name: " + super.getName() +
                ", expiration date: " + new SimpleDateFormat("yyyy-MM-dd").format(expirationDate);
                
    }
}
