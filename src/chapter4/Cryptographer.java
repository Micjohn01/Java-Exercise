package chapter4;

public class Cryptographer {
    public static String encrypt(int digits){
        int result = 0;
        int firstDigit = digits/1000;
        int secondDigit = (digits % 1000) / 100;
        int thirdDigit = (digits % 1000 % 100) / 10;
        int forthDigit = digits % 1000 % 100 % 10;

        firstDigit +=7;
        secondDigit +=7;
        thirdDigit +=7;
        forthDigit +=7;

        firstDigit %= 10;
        secondDigit %= 10;
        thirdDigit %= 10;
        forthDigit %= 10;

        int tempStorage = firstDigit;
        firstDigit = thirdDigit;
        thirdDigit = tempStorage;

        tempStorage = secondDigit;
        secondDigit = forthDigit;
        forthDigit = tempStorage;

        return "" + firstDigit + secondDigit + thirdDigit + forthDigit;
    }

}
