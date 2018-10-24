package Module11;

import java.util.HashMap;

/**
 *
 * @author Nicolai Gram
 */
public class Testing {

    public static void main(String[] args) {
        Circle c = new Circle(1, 2, 3);
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println(map.put("Hej", 337));
    }

}

class Shape {

    private int cx, cy;

    public Shape() {
        System.out.println("No arg constructor of shape!");
    }

    public Shape(int cx, int cy) {
        this.cx = cx;
        this.cy = cy;
    }

}

class Circle extends Shape {

    private int r;

    public Circle(int r, int cx, int cy) {
        this.r = r;
    }
}
