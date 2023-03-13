package chapter15.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExampleOne {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\user\\IdeaProjects\\exercises\\src\\chapter8");
        System.out.println(path.getFileSystem());
//        check to see if path points to a directory
        System.out.println("is directory:: "+Files.isDirectory(path));
//        check to see if path points to a hidden resource
        try{
            System.out.println("Hidden? "+Files.isHidden(path));
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
//        check to see if path exist at all
        System.out.println("Exist? "+Files.exists(path));
    }
}