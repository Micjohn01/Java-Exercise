package practise;

public class ArrayMethodTest {
    public static void main(String[] args) {
        ArrayMethod arrayMethod = new ArrayMethod();
        int[] numbers = {43, 2, 12, 22, 15};
//        System.out.println("The total of all the numbers is: " + arrayMethod.addingNumbers(new int[]{43, 2, 12, 22, 15}));
//        System.out.printf("The total of all the numbers is: %d%n", arrayMethod.addingNumbers(new int[]{43, 2, 12, 22, 15}));
        System.out.printf("The total of all the numbers is: %d%n", arrayMethod.addingNumbers(numbers));
    }
}
