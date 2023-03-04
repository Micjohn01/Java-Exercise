package chapter2;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number:");
        int num1 = input.nextInt();

        System.out.print("Enter your second number:");
        int num2 = input.nextInt();

        int square1 = num1 * num1;
        int square2 = num2 * num2;
        int sum = square1 + square2;
        int difference = square1 - square2;

        System.out.printf("First square %d%n", square1);
        System.out.printf("Second square is %d%n", square2);
        System.out.printf("Sum of squares is %d%n", sum);
        System.out.printf("Difference of squares is %d%n", difference);
//        sum of their squares, difference of the squares
    }
}
