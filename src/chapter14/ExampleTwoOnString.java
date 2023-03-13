package chapter14;

import java.util.Arrays;

public class ExampleTwoOnString {
    public static void main(String[] args) {

        char[] chars = new char[20];
        String string = new String("Semicolon Africa");
        string.getChars(2,10,chars,12);

        System.out.println(Arrays.toString(chars));

        String A = "hello";
        String B = "hello";
        System.out.println(B);
        System.out.printf("The string is: %s", A);
    }
}