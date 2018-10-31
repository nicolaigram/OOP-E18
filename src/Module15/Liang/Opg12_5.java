package Module15.Liang;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Opg12_5 {

    public static void main(String[] args) {
        
        try {
            Triangle t = new Triangle(7,10,5);
        } catch (IllegalTriangleException ex) {
            System.out.println("Invalid triangle.");
        }
        
        try {
            Triangle t = new Triangle(1,10,12);
        } catch (IllegalTriangleException ex) {
            System.out.println("Invalid triangle.");
        }
    }
}

class Triangle {

    private double a;
    private double b;
    private double c;
    
    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        this.a = a;
        this.b = b;
        this.c = c;
        if (!isValid()) {
            throw new IllegalTriangleException();
        }
        System.out.println("Triangle object was created!");
    }

    private boolean isValid() {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return false;
        } else {
            return true;
        }
    }
}
