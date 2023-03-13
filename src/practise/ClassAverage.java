package practise;

import java.util.Scanner;
public class ClassAverage {

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            int total = 0;
            int gradeCounter = 1;

//            gradeCounter can be initialized to 0, and gradeCounter will be < 10

            while (gradeCounter <= 10){
                System.out.println("Enter grade:");
                int grade = input.nextInt();
                total = total + grade;
                gradeCounter = gradeCounter + 1;
            }

            int average = total / 10;

            System.out.printf("%n The total grade is: %n%d", total);
            System.out.printf("%n The average garde is: %n%d", average);
        }
    }
