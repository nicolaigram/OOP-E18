package Module08;

import java.util.Date;

/**
 *
 * @author Nicolai Gram
 */
public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this(Fan.SLOW, false, 5, "blue");
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan{" + "speed=" + speed + ", color=" + color + ", radius=" + radius + "}";
        } else {
            return "Fan{" + "color=" + color + ", radius=" + radius + ", the fan is OFF}";
        }
    }
    
    public String toString(Date date) {
        if (on) {
            return "[" + date.toString() + "] Fan{" + "speed=" + speed + ", color=" + color + ", radius=" + radius + "}";
        } else {
            return "[" + date.toString() + "] Fan{" + "color=" + color + ", radius=" + radius + ", the fan is OFF}";
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
}
