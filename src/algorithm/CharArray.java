package algorithm;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
//        char [] array = new char[3];
//        char[] array = {'x', 'o', 'x'};
        char[][] array = {
                {'X', 'O', 'X'},
                {'X', 'O', 'X'},
                {'X', 'X', 'O'}};

        System.out.println(Arrays.deepToString(array));

        for (char row = 0; row < array.length; row++){
            for (char col = 0; col < array[row].length; col++){
                System.out.print(array[row][col] + " ");
        }
            System.out.println();
        }
    }

}