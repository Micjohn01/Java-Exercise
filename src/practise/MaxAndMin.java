package practise;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++){
            System.out.println("Enter any number: ");
            int number = input.nextInt();
            if (minimum < number ){
                minimum = number;
            } else if (maximum > number) {
                maximum = number;
            }
        }
        System.out.println(maximum);
        System.out.println(minimum);
    }
}


