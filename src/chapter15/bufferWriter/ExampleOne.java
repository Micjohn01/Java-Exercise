package chapter15.bufferWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ExampleOne {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("micjohn.txt"))){
            writer.write("Micjohn-Micorazon");

        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
