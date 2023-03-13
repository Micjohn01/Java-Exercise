package chapter7;

public class AlphaNumeric {
    public static int count(String text){
        int numberOfDigits = 0;
        for (int counter = 0; counter < text.length(); counter++){
            if(Character.isDigit(text.charAt(counter))) numberOfDigits+=1;
        }
        return numberOfDigits;
    }

//    public static int counter(String text){
//        String numbers = "0123456789";
//        int
//        for (int counter = 0; counter < text.length(); counter++){
//            if(Character.isDigit(text.charAt(counter))) numberOfDigits+=1;
//        }
//        return numberOfDigits;
//    }
}
