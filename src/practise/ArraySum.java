package practise;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 5, 10, 12};
                int total = 0;
        for(int counter = 0; counter < array.length; counter++){
            total += array[counter];
        }
        System.out.printf("Total of array elements is: %d%n", total);
    }
}
