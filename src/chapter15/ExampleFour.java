//package chapter15;
//
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.io.PrintStream;
//
//public class ExampleFour {
//    public static void main(String[] args) {
//        /**
//         System.setIn();
//         System.setOut();
//         System.setErr();
//         */
//        byte[] bytes = "Hello, World".getBytes();
//
//        try (PrintStream printStream = new PrintStream(System.out)) {
//            System.setOut(printStream);
//            try (DataOutputStream dataOutputStream = new DataOutputStream(System.out)) {
//                dataOutputStream.write(bytes);
//            } catch (IOException exception) {
//                System.err.println(exception.getMessage());
//            }
//        } catch (IOException exception) {
//            System.err.println(exception.getMessage());
//        }
//    }
//}
