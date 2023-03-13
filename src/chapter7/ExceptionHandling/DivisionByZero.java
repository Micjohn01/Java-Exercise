package chapter7.ExceptionHandling;

import javax.swing.*;
import java.util.Scanner;

public class DivisionByZero {
    public static void main(String... args) {

        while (true) {
            int numerator = input("Enter a numerator");
            int denominator = input("Enter a denominator");
            try {
                display("Your integer quotient is" + numerator / denominator);
            } catch (ArithmeticException yoiu) {
                display(yoiu.getMessage());
                main();
            }

        }

    }

    private static int input(String prompt) {
        System.out.println(prompt);
        int userInput = 0;
        try{
            return Integer.parseInt(JOptionPane.showInputDialog(prompt));
        }
        catch(NumberFormatException pps){
            display("Wrong input type");
            return input(prompt);
        }
    }

    private static void display(String prompt){  JOptionPane.showMessageDialog(null, prompt);}
}
