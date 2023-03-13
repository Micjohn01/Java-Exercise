package chapter15.formatter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String patch = " this is not easy";

        try(Formatter formatter = new Formatter("test.txt")){
            Scanner scanner =
                new Scanner(new FileInputStream("C:\\Users\\user\\IdeaProjects\\exercises\\micjohn.txt"));
            String str = scanner.nextLine();
            builder.append(str);
            formatter.format("files content have been updated from %s to %s", str, builder.append(patch));
        }catch (FileNotFoundException exception){
        System.err.println(exception.getMessage());
    }

    }
}
