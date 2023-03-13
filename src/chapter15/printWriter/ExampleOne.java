package chapter15.printWriter;

import java.io.IOException;
import java.io.PrintWriter;

public class ExampleOne {
    public static void main(String[] args) {
        try(PrintWriter printWriter = new PrintWriter("oluwadamipe.txt")){
            printWriter.println("I'm in love with my sunshine");
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
