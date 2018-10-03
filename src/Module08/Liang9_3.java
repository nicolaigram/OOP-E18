package Module08;

import java.util.Date;

/**
 *
 * @author Nicolai Gram
 */
public class Liang9_3 {
    public static void main(String[] args) {
        
        for (int i = 4; i < 12; i++) {
            Date date = new Date();
            date.setTime(date.getTime() + (long) Math.pow(10, i));
            System.out.println(date.toString());
        }
    }
}
