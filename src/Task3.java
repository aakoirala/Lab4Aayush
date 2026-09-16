import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        //variables
        Scanner scan = new Scanner(System.in);

        double springCost;
        double summerCost;
        double fallCost;
        double winterCost;
        double yearlyCost;

        System.out.println("What is your maintence cost for spring? ");
        springCost = scan.nextDouble();
        System.out.println("What is your maintence cost for summer? ");
        summerCost = scan.nextDouble();
        System.out.println("What is your maintence cost for fall? ");
        fallCost = scan.nextDouble();
        System.out.println("What is your maintence cost for winter? ");
        winterCost = scan.nextDouble();

        yearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Your yearly maintenance cost is $" + yearlyCost);
    }
}
