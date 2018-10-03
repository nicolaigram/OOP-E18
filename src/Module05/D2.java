package Module05;

public class D2 {
    public static void main(String[] args) {
        int[] circles = new int[]{3, 7};
        for (int r : circles) {
            System.out.printf("%d    has circimference of %.2f%n", r, calcCircumference(r));
        }
    }
    
    private static double calcCircumference(int r) {
        return 2 * Math.PI * r;
    }
}
