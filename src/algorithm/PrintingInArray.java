package algorithm;

public class PrintingInArray {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        array[1][1] = 1;
        array[2][3] = 1;
        array[3][3] = 1;
        array[3][2] = 1;
        array[4][4] = 1;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = row + col;
                if (array[row][col] == 1) {
                    System.out.print("*");
                }
                else
                    System.out.print("-");
            }
            System.out.println();
        }
    }
}
