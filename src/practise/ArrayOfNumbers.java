package practise;

public class ArrayOfNumbers {
    public static int sumOfArray(int[] array) {
        int total = 0;
        for (int number:array){
            total += number;
        }
        return total;
    }

    public static int minimumArray(int[] array) {
        int minimum = array[0];
        for(int index:array){
            if(index < minimum){
                minimum = index;
            }
        }
        return minimum;
    }

    public static int maximumArray(int[] array) {
        int maximum = array[0];
        for(int index:array){
            if(index > maximum){
                maximum = index;
            }
        }
        return maximum;
    }

    }
