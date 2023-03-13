package chapter4;

public class Calculator {
    public static long factorial(long number){
        long result = number;
        for(long i = number-1; i > 0; i--){
            result = result * i;
        }
        return result;
    }
}
