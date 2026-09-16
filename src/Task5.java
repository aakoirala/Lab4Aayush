import java.util.Scanner;
public class Task5 {
    public static void main() {
        //variables
        Scanner scan = new Scanner(System.in);

        double fahrenheit;
        double fahrenheitToCelsius;

        System.out.println("What is your temperature in fahrenheit?");
        fahrenheit = scan.nextDouble();

        fahrenheitToCelsius = ((fahrenheit - 32) * 5/9);

        System.out.println("Your temperature in celsius is " + fahrenheitToCelsius + " degrees.");
    }
}
