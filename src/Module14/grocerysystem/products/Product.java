package Module14.grocerysystem.products;

import Module14.grocerysystem.products.interfaces.Expirable;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Product implements Expirable {

    private UUID serial;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.serial = UUID.randomUUID();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public UUID getSerial() {
        return serial;
    }

    @Override
    public boolean isExpired() {
        throw new UnsupportedOperationException("”Product does not support this operation.");
    }

}
