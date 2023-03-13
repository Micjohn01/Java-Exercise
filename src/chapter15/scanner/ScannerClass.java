package chapter15.scanner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream =
                     new FileInputStream("C:\\Users\\user\\IdeaProjects\\exercises\\oluwadamipe.txt")) {
            Scanner scanner = new Scanner(fileInputStream);
            String input = scanner.nextLine();
            System.out.println("Program read:: "+input);
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
    }
}
