package chapter14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternInString {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher("Java SE");
        System.out.println(matcher.matches());

        Pattern patterns = Pattern.compile("e.+?d");
        Matcher matchers = patterns.matcher("endangered species will end up dead");

        while(matchers.find()){
            System.out.println("matched-> " + matchers.group());
        }
    }
}