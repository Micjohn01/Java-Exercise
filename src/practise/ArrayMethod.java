package practise;

public class ArrayMethod {
    public int addingNumbers(int[]number) {
        int total = 0;
        for(int counter = 0; counter < number.length; counter++){
            total += number[counter];
        }
        return total;
    }
}
