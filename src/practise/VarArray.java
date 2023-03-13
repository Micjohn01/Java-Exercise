package practise;

public class VarArray {
    public static double average(double... numbers){
        double total = 0.0;
        for(double number : numbers) {
            total += number;
        }
        return total / numbers.length;
    }

    public static void main(String[] args) {
        double num1 = 20.00;
        double num2 = 65.00;
        double num3 = 52.00;
        double num4 = 48.00;

        System.out.printf("num1 = %.1f%nnum2 = %.1f%nnum3 = %.1f%nnum4 = %.1f%n", num1, num2, num3, num4);

        System.out.printf("Average of num1 and num2 is %.1f%n", average(num1, num2));
        System.out.printf("Average of num1, num2, num3 is %.1f%n", average(num1, num2, num3));
        System.out.printf("Average of num1, num2, num3, num4 is %.1f%n", average(num1, num2, num3, num4));
    }
}
