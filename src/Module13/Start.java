package Module13;

public class Start {
    public static void main(String[] args) {
        CsvHandler csvHandler = new CsvHandler("twocolors.csv");
        csvHandler.startUI();
    }
}
