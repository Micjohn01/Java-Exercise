package chapter2;

import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any integer:");
        int num1 = input.nextInt();
        int num = 100;
        int square = num1 * num1;

        if (square > num)
            System.out.printf("%d > %d%n", square, num);
        if (square == num)
            System.out.printf("%d == %d%n", square, num);
        if (square != num)
            System.out.printf("%d != %d%n", square, num);
        if (square < num)
            System.out.printf("%d < %d%n", square, num);
    }
}
