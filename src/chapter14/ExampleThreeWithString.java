package chapter14;

public class ExampleThreeWithString {
    public static void main(String[] args) {
        String name = "hello";
        System.out.println(name.compareTo("hemlo"));

        String str = new String("hello");
        System.out.println(name.equals(str));
        System.out.println(name == str);

        System.out.println(name.indexOf('e', 2));
        System.out.println(name.lastIndexOf('l'));
        System.out.println();

        String school = "Semicolon Africa";
        String continent = school.substring(10);
        System.out.println(continent);

    }
}
