package algorithm;

public class ArrayFillingUsingLoop {
    public static void main(String[] args) {
        int [] numbers = new int[10];

        for (int i = 1; i <= 10; i++) {
            numbers[i - 1] = i;
//            for (int i = 0; i < 10; i++) {
//                numbers[i] = 1+i;
        }
//        System.out.println(Arrays.toString(numbers));
        for (int count = 0; count < numbers.length; count++){
            System.out.print(numbers[count] + " , ");
        }
//        for (int number : numbers) {
//            System.out.print(number + " , ");
    }
}
