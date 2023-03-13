package practise;
//METHOD OVERLOADING DRIVER'S CLASS

public class AddNumbersTest {
    public static void main(String[] args) {
        AddNumbers addNumbers = new AddNumbers();
        System.out.println(addNumbers.addition(2,2));
        System.out.println();
        System.out.println(addNumbers.addition(3,5.6));
        System.out.println();
        System.out.println(addNumbers.addition(7.0,4.5));
        System.out.println();
        System.out.println(addNumbers.addition(9.5,3));
    }

}
