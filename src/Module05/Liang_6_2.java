package Module05;


public class Liang_6_2 {

    public static void main(String[] args) {
        System.out.println(sumDigits(84));
    }
    
    private static int sumDigits(int digits) {
        int result = 0;
                                   // Iteration 1      // Iteration 2       // Iteration 3
        while (digits != 0) {      // Digits = 84      // Digits = 8        // Digits = 0, loop will not run
            result += digits % 10; // Digits % 10 = 4  // Digits % 10 = 8
            digits /= 10;          // Digits / 10 = 8  // Digiits / 10 = 0
        }
        
        return result;
    }
}
