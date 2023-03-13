package chapter3;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

class HealthRecordsTest {
    public static void main(String[] args) {
        HealthRecords hr = new HealthRecords("Daniel","Akinsanya","Male",12,
                10,2000,66,12);

        Scanner input = new Scanner(System.in);

        System.out.println("BMI VALUES ");
        System.out.println("Underweight: less than 18.5 ");
        System.out.println("Normal: between 18.5 and 24.9 ");
        System.out.println("Overweight: between 25 and 29.9 ");
        System.out.println("Obese: 30 or greater ");
        System.out.println();

        System.out.print("Please enter your first name: ");
        String firstname = input.nextLine();
        hr.setFirstName(firstname);

        System.out.print("Please enter your last name: ");
        String lastName = input.nextLine();
        hr.setLastName(lastName);

        System.out.print("What is your gender: ");
        String gender = input.nextLine();
        hr.setGender(gender);

        System.out.print("Please enter your day of birth: ");
        int day = input.nextInt();
        hr.setDay(day);

        System.out.print("Please enter your month of birth: ");
        int month = input.nextInt();
        hr.setMonth(month);

        System.out.print("Please enter your year of birth: ");
        int year = input.nextInt();
        hr.setYearOfBirth(year);

        System.out.printf("%s%n",firstname);
        System.out.printf("%s%n",lastName);
        System.out.printf("Gender:%s%n",hr.getGender());
        System.out.printf("Year of birth is:%s%n",hr.getDateOfBirth());
        System.out.printf("The height in inches is:%d%n",hr.getHeightInInches());
        System.out.printf("The weight in pounds is:%d%n",hr.getWeightInPounds());
        System.out.printf("The maximum heart rate is:%d%n",hr.getMaximumHeartRate());
        System.out.printf("The target heart rate is:%d - %d%n",hr.getTotalTargetHeartRate1(),
                hr.getTotalTargetHeartRate2());
        System.out.printf("The body mass index is:%d%n",hr.getBodyMassIndex());
    }
}