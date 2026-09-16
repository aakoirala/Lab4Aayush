import java.util.Scanner;
public class Task4 {
    static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);

        int creditCardBalance = 5000;
        double interestRate = 0.17;
        double monthOneBalance = creditCardBalance + (creditCardBalance * interestRate);
        double monthTwoBalance = monthOneBalance + (monthOneBalance * interestRate);

        System.out.println("Your month one balance is $" + monthOneBalance);
        System.out.println("Your month two balance is $" + monthTwoBalance);
    }
}
