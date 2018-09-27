package Module4;

public class Liang7_3 {

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5};
        int[] counter = new int[50]; // Input 0 - 49

        /* Count input array */
        for (int i = 0; i < input.length; i++) {
            counter[input[i]]++;
        }

        /* Print results */
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > 0) {
                System.out.println(i + " has " + counter[i] + (counter[i] > 1 ? " appearances" : " appearance"));
            }
        }
    }
}
