package chapter15.bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleTwo {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader("C:\\Users\\user\\IdeaProjects\\exercises\\src\\chapter15\\text.txt"))){
            System.out.println(bufferedReader.readLine());
        } catch (IOException exception){
        System.err.println("exception message:: " +exception.getMessage());
        }
    }
}
