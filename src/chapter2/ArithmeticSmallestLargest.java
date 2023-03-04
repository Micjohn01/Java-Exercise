package chapter2;

import java.util.Scanner;

public class ArithmeticSmallestLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number:");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number:");
        int num2 = input.nextInt();
        System.out.print("Enter Third Number:");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int average = (num1 + num2 + num3) / 3;
        int product = num1 * num2 * num3;

        System.out.printf("Sum of three numbers is: %d%n", sum);
        System.out.printf("Average of three numbers is: %d%n", average);
        System.out.printf("Product of three numbers is: %d%n", product);

        if (num1 < num2)
            System.out.printf("%d < %d%n", num1, num2);
        if (num1 > num2)
            System.out.printf("%d > %d%n", num1, num2);
        if (num2 < num3)
            System.out.printf("%d < %d%n", num2, num3);
        if (num2 > num3)
            System.out.printf("%d > %d%n", num2, num3);

    }
}
