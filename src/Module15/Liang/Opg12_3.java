package Module15.Liang;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nicolai Gram
 */
public class Opg12_3 {

    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        try {
            System.out.print("Please enter index of month: ");
            Scanner sc = new Scanner(System.in);
            int userInput = sc.nextInt();
            System.out.printf("You picked %s which has %s days.", months[userInput], dom[userInput]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid index. Index out of bounds.");
        } catch (InputMismatchException ex) {
            System.out.println("Invalid input. Must be of type integer");
        }
    }
}
