package Module5;

public class D5 {

    public static void main(String[] args) {
        init();
    }
    
    public static void init() {
        for (int i = 100; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime!");
            }
        }
    }
    
    public static boolean isPrime(int potential) {
        if (potential < 2) return false;
        if (potential == 2) return true;
        if (potential % 2 == 0) return false;
        for (int i = 3; i * i <= potential; i += 2)
            if (potential % i == 0) return false;
        return true;
    }
}
