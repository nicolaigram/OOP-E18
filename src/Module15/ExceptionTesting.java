package Module15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolai Gram
 */
public class ExceptionTesting {

    public static void main(String[] args) {
        
        File file = new File("test.test");
        try {
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExceptionTesting.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //        try {
//            ExceptionTesting.printFile();
//        } catch (MyException ex) {
//            Logger.getLogger(ExceptionTesting.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public static void printFile() throws MyException {
        throw new MyException();
    }
}

class MyException extends Exception {

}
