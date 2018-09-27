package Module5;

public class Liang_6_22 {

    public static void main(String[] args) {
        int num = 25;
        System.out.format("%-16s %f%n", "Javas sqrt: ", Math.sqrt(num));
        System.out.format("%-16s %f%n", "My sqrt: ", sqrt(num, 0.000000001));
    }

    private static double sqrt(long n, double deviation) {
        double nextGuess = 1;
        double lastGuess;

        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;  // nextGuess = (1 + 5 / 1) / 2 (= 3)  // nextGuess = (3 + 5 / 3) / 2 (= 1.33333)
        } while (Math.abs(nextGuess - lastGuess) > deviation);

        return nextGuess;

    }
}
