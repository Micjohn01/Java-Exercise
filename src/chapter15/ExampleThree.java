package chapter15;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ExampleThree {
    public static void main(String[] args) {
        byte[] bytes = new byte[50];
        try(var dataInputStream = new DataInputStream(System.in)){
            int numberOfBytesRead = dataInputStream.read();
            System.out.println("numberOfBytesRead:: "+numberOfBytesRead);
            for (byte b: bytes) {
                if(b!=0) System.out.print(Character.toString(b));
            }
//            System.out.println(Arrays.toString(bytes));
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
