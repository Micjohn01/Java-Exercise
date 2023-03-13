package ArrayQuestions;

public class ReverseAnArray {
    public static void main(String[] args) {
        Integer[] intArray = {9, 7, 4, 3, 1, 6, 0};

        //print array starting from first element
        System.out.println("Original Array:");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");

        System.out.println();

        //print array starting from last element
        System.out.println("Original Array printed in reverse order:");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");
    }
}
