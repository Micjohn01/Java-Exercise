package tddChapter2;

public class Arith {

    public int inputNum1(int num1) {
        return num1 * num1;
    }

    public int inputNum2(int num2) {
        return num2 * num2;
    }

    public int sumOfSquares(int num1, int num2) {
        int num1Sqr = (int) Math.pow(num1,2);
        int num2Sqr = (int) Math.pow(num2,2);

        return  num1Sqr + num2Sqr;
    }

    public int differenceOfSquares(int num1, int num2) {
        int num1Sqr = (int) Math.pow(num1,2);
        int num2Sqr = (int) Math.pow(num2,2);

        return  num1Sqr - num2Sqr;
    }
}
