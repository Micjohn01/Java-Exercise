package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForWhileDoWhileLoop {
    public static void main(String[] args) {

//        USING FOR LOOP
        List<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int sum = 0;
        for (Integer integer : number) sum += integer;
        System.out.println("sum of numbers in list using FOR loop is: " + sum);

//        USING WHILE LOOP
        int count = 0;
        while (number.size() > count) {
            sum += number.get(count);
            count++;
            System.out.println("sum of numbers in list using WHILE loop is: " + sum + " ");
        }

//        USING DO-WHILE
        do {
            sum += count;
            count++;
        } while (number.size() > count);
        System.out.println("The sum of numbers in list using DO-WHILE loop is: " + sum);
    }
}
