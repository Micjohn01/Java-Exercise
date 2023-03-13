package tddChapter2;

public class Comparing {

    public int numberInput(int number) {
        if (number <= 0){
            System.out.printf("%s%n", "Invalid Integer!");
        }
        return number;
    }
    public String Numberless(int  number) {
        if (number < 100) {
            return "Number less than 100";
        }
        return null;
    }

    public String NumberGreat(int number) {
        if (number > 100) {
            return "Number Greater than 100";
        }
        return null;
    }

    public String NumberEqual(int number) {
        if (number == 100) {
            return "Number is equal to 100";
        }
        return null;
    }

    public String NumberNotEqual(int number) {
        if(number != 100) {
            return "Number is not equal to 100";
        }
        return null;
    }

    public int numberSquare(int number) {
        return (int) Math.pow(number,2);
    }

    public String numberSquareGreater(int number) {
        int numberSquared = (int) Math.pow(number, 2);
        if (numberSquared > 100) {
            return "Number squared is greater than 100";
        }
        return null;
    }

    public String numberSquareEqual(int number) {
        int numberSquared = (int) Math.pow(number, 2);
        if (numberSquared == 100){
            return "Number squared equal to 100";
        }
        return null;
    }

    public String numberSquareNotEqual(int number) {
        int numberSquared = (int) Math.pow(number,2);
        if(numberSquared != 100){
            return "Number squared not equal to 100";
        }
        return null;
    }

    public String numberSquareLess(int number) {
        int numberSquared = (int) Math.pow(number,2);
        if (numberSquared < 100){
            return "Number squared is less than 100";
        }
        return null;
    }
}
