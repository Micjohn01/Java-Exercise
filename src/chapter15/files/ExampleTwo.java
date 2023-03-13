//package chapter15.files;
//
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//public class ExampleTwo {
//    public static void main(String[] args) {
//        Path path = Paths.get("");
//        Files.isDirectory(path);
//        System.out.println("isDirectory:: "+Files.isDirectory(path));
//        System.out.println("Exist:: "+Files.isDirectory(path));
//        Files.getLastModifiedTime(path);
//        try {
//            System.out.println("modified:: " +Files.getLastModifiedTime(relative));
//        } catch (IOException exception){
//            exception.printStackTrace();
//            System.err.println("error:: "+exception.getMessage());
//    }
//}
/**
 package chapter15.classesAndInterfacesNIO;

 import java.io.IOException;
 import java.nio.file.Files;
 import java.nio.file.Path;
 import java.nio.file.Paths;

 public class FileSample2UsingRelativePath {
 public static void main(String[] args) {
 Path currentDirectory  = Paths.get("").toAbsolutePath();
 System.out.println(currentDirectory);
 Path target = Paths.get("/home/samuel/IdeaProjects/JavaDietelExercises/src/chapter15/classesAndInterfacesNIO/..");
 Path relative = currentDirectory.relativize(target);
 System.out.println(relative);
 System.out.println(relative.getFileSystem());
 System.out.println("isDirectory:: "+ Files.isDirectory(relative));
 System.out.println("exists:: " +Files.exists(relative));
 try {
 System.out.println("modified:: " +Files.getLastModifiedTime(relative));
 } catch (IOException exception){
 exception.printStackTrace();
 System.err.println("error:: "+exception.getMessage());
       }

     }
 }
 */