package chapter11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//public class Example1 {
//    public static void main(String[] args) throws IOException {
//        FileReader reader = new FileReader("C:\\Users\\user\\IdeaProjects\\exercises\\src\\chapter11\\Cohort13");
//        BufferedReader bufferedReader = new BufferedReader(reader);
//        System.out.println(bufferedReader.readLine());
//    }
//}

//public class Example1 {
//    public static void main(String[] args)throws IOException {
//        FileReader reader = null;
//        BufferedReader bufferedReader = null;
//        try {
//            reader = new FileReader("Cohort13");
//            bufferedReader = new BufferedReader(reader);
//            System.out.println(bufferedReader.readLine());
//        } catch (IOException exception){
//            System.out.println(exception.getMessage());
//        }finally {
//            if (reader!=null) {
//                reader.close();
//            }
//            if (bufferedReader!=null){
//                bufferedReader.close();
//            }
//        }
//    }
//}

public class Example1 {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] numbers = {23, 25, 18, 90, 100};

    public static void main(String[] args) {

        System.out.println("Enter a number: ");

        int userInput = scanner.nextInt();
        try {
            verifyNumber(userInput);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            for (int i = 0; i < 10; i++) {
                System.out.println(".");
            }
        }
    }
    private static void verifyNumber(int userInput) throws NumberNotFoundException{
        for(int number:numbers){
            if (number== userInput){
                System.out.println("Found");
                System.exit(0);
            }
        }
        throw new NumberNotFoundException("number you entered does not exist");
    }
}