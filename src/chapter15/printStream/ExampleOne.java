package chapter15.printStream;

import java.io.IOException;
import java.io.PrintStream;

public class ExampleOne {
    public static void main(String[] args) {
        try(PrintStream printStream = new PrintStream("output.txt")){
            System.setOut(printStream);
            System.out.println("Java Programming is bomb");
        } catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
