package Module05;


public class Liang_6_3 {

    public static void main(String[] args) {
        System.out.println(reverse(1628));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
    }

    private static int reverse(int num) { // Num = 25
        int numRev = 0;
        
        while (num != 0) {
            numRev *= 10;
            numRev += num % 10;
            num = num / 10;
        }
        
        return numRev;
    }
    
    private static boolean isPalindrome(int num) {
        return num == reverse(num);
    }
}
