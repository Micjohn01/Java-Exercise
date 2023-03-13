package ArrayQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLargestElement {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 7, 6);
        Integer largestElement = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > largestElement)
                largestElement = arrayList.get(i);
        }
        System.out.println("The maximum value is: " + largestElement);

        //        for (Integer integer : arrayList) {
//            if (integer > largestElement)
//                largestElement = integer;

    }

    public static List<Integer> largeElements(List<Integer> arrayList) {
        List<Integer> largest = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            Integer largestElement = 0;
            if (arrayList.get(i) > largestElement)
                largestElement = arrayList.get(i);
            return largest;
//        }

//        for (Integer integer : arrayList) {
//            if (integer > largestElement)
//                largestElement = integer;


        }
        return largest;
    }
}
