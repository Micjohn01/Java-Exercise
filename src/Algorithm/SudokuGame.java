package Algorithm;

public class SudokuGame {
    public static void main(String[] args) {
        int[][] array = new int[9][9];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = row + col + 1;
                if (array[row][col] > 9) {
                    array[row][col] -= 9;
                }
                System.out.printf("%d ", array[row][col]);
            }
            System.out.println();
        }
    }
}
