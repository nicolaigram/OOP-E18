package Module5;

public class Liang_6_8 {

    public static void main(String[] args) {
        printTable();
    }

    private static double milesToKilometers(double miles) {
        return miles * 1.609;
    }

    private static double kilometersToMiles(double kilometers) {
        return kilometers / 1.609;
    }

    private static void printTable() {
        System.out.format("%-12s %-12s %-6s %-12s %-12s%n", "Miles", "Kilometers", "|", "Kilometers", "Miles");
        int miles = 1;
        int kilometers = 20;
        while (miles <= 10) {
            System.out.format("%-12d %-12.3f %-6s %-12d %-12.3f%n", miles, milesToKilometers(miles), "|", kilometers, kilometersToMiles(kilometers));
            miles += 1;
            kilometers += 5;
        }

    }
}
