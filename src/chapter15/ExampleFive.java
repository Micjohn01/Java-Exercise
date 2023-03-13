package chapter15;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ExampleFive {
    public static void main(String[] args) {
        try {
            PrintStream printStream = new PrintStream("C:\\Users\\user\\IdeaProjects\\exercises\\src\\chapter15\\text.txt");
            printStream.println("Your head is big");

        }catch (FileNotFoundException exception){
            System.out.println(exception.getMessage());

        }
    }
}
