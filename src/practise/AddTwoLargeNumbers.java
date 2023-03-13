package practise;

public class AddTwoLargeNumbers {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 9, 2};
        int firstMax = 0;
        int secondMax = 0;
        for (int value : numbers) {
            if (value > firstMax){
                secondMax = firstMax;
                firstMax = value;
            }
        }
        int total = firstMax + secondMax;
        System.out.println(total);
    }
}
