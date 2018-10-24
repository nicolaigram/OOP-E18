package Module13;

import java.io.PrintStream;
import java.text.SimpleDateFormat;

public class Testing {

    public static void main(String[] args) {
        PrintStream myStream = new PrintStream(System.out) {
            @Override
            public void println(String x) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                super.println(sdf.format(System.currentTimeMillis()) + ": " + x);
            }
        };
        
        System.setOut(myStream);
        System.out.println("Hej!");
    }
}
