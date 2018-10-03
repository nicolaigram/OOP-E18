package Module08;

import java.util.Date;

/**
 *
 * @author Nicolai Gram
 */
public class Liang9_8 {

    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan.toString());
        fan.setOn(true);
        System.out.println(fan.toString());
        
        System.out.println(fan.toString(new Date()));
    }
}
