package ArrayQuestions;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "kayak";
        if (isPalindrome(str))
            System.out.print("String is Palindrome");
        else
            System.out.print("Not palindrome");
    }

    private static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static String strPalindrome(String str) {
        String palindrome = new String();
        if (isPalindrome(str))
            System.out.print("String is Palindrome");
        else
            System.out.print("Not palindrome");
        return palindrome;
    }

}
