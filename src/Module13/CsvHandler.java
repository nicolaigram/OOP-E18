package Module13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvHandler {

    private File file;
    private ArrayList<String> strings;

    public CsvHandler(String path) {
        file = new File(path);
        strings = new ArrayList<>();
        this.load();
    }

    private void load() {
        try {
            Scanner sc = new Scanner(file).useDelimiter(",");
            while (sc.hasNext()) {
                strings.add(sc.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error loading file!");
            System.out.println(e.getMessage());
        }
    }

    private void save() {
        PrintWriter pw = null;
        try {
            File newFile = new File(this.file.getAbsolutePath());
            pw = new PrintWriter(newFile);
            for (String s : strings) {
                pw.print(s);
                if (s != strings.get(strings.size() - 1)) {
                    pw.print(",");
                }
            }
            System.out.printf("File saved at path: [%s]%n", newFile.getAbsolutePath());
        } catch (FileNotFoundException e) {
            System.out.println("Error saving file!");
            System.out.println(e.getMessage());
        } finally {
            pw.close();
        }
    }

    private void print() {
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            System.out.printf("[%s] %s%n", i, s);
        }
    }

    private boolean removeLine(int index) {
        try {
            String text = strings.get(index);
            strings.remove(index);
            System.out.printf("Success! Removed string \"%s\" at index [%s]%n", text, index);
            return true;
        } catch (Exception e) {
            System.out.println("Error removing line. Index must be between 0 and " + (strings.size() - 1));
            return false;
        }
    }

    private boolean addLine(int index, String text) {
        try {
            strings.add(index, text);
            System.out.printf("Success! Added string \"%s\" at index [%s]%n", text, index);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean addLine(String text) {
        return this.addLine(strings.size() - 1, text);
    }

    public void startUI() {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            printWelcome();
            input = sc.next();
            switch (input) {
                case "pf":
                    this.print();
                    break;
                case "al":
                    this.promptAddLine();
                    break;
                case "rl":
                    this.promptRemoveLine();
                    break;
                case "sa":
                    this.save();
                    break;
                case "ex":
                    System.out.println("Exiting application ...");
                    return;
                default:
                    System.out.println("Command was not recognized. Please try again");
                    break;
            }
        } while (true);
    }

    private void printWelcome() {
        System.out.println("\nAvailable commands:");
        System.out.println("pf - Print file");
        System.out.println("al - Add line");
        System.out.println("rl - Remove line");
        System.out.println("sa - Save file");
        System.out.println("ex - Exit");
        System.out.print("\n> ");
    }
    
    public void promptAddLine() {
        String inputText;
        int inputIndex;
        System.out.print("Text: ");
        inputText = promptString();

        System.out.printf("Enter index (0 - %s): ", strings.size() - 1);
        inputIndex = promptIndex();

        this.addLine(inputIndex, inputText);
    }
    
    private void promptRemoveLine() {
        System.out.printf("Enter index (0 - %s): ", strings.size() - 1);
        this.removeLine(promptIndex());
    }

    private int promptIndex() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (sc.hasNextInt()) {
                int index = sc.nextInt();
                if (index >= 0 && index < strings.size()) {
                    return index;
                } else {
                    System.out.printf("Index out of bounds. Must be between 0 and %s. Please try again: ", (strings.size() - 1));
                }
            } else {
                System.out.printf("\"%s\" is not a valid int. Please try again: ", sc.nextLine());
            }
            sc.nextLine(); // Move to next line. Important stepp, because I only read next int (inline) above.
        }
    }

    private String promptString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
