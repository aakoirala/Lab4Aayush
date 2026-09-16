import java.util.Scanner;
public class Task2 {
    public static void main() {
        //variables
        Scanner scan = new Scanner(System.in);

        double customerPrice;
        double total;
        double salesTax = 0.05;

        System.out.println("Enter the price of your purchase: ");
        customerPrice = scan.nextDouble();

        total = customerPrice + (customerPrice * salesTax);

        System.out.println("Your total cost is $" + total);
    }
}
