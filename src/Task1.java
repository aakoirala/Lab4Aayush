import java.util.Scanner;
public class Task1 {
    public static void main() {
        //variables
        Scanner scan = new Scanner(System.in);

        int intOperandA = 9;
        int intOperandB = 8;
        int intSum = intOperandA + intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intQuotient = intOperandA/intOperandB;
        int intModulo = intOperandA % intOperandB;

        double doubleOperandA = 9.5;
        double doubleOperandB = 8.2;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleQuotient = doubleOperandA/doubleOperandB;
        double doubleModulo = doubleOperandA % doubleOperandB;

        System.out.println("The sum using ints of " + intOperandA + " + " + intOperandB + " is " + intSum);
        System.out.println("The difference using ints of " + intOperandA + " - " + intOperandB + " is " + intDifference);
        System.out.println("The product using ints of " + intOperandA + " * " + intOperandB + " is " + intProduct);
        System.out.println("The quotient using ints of " + intOperandA + " / " + intOperandB + " is " + intQuotient);
        System.out.println("The remainder using ints of " + intOperandA + " % " + intOperandB + " is " + intModulo);

        System.out.println("The sum using doubles of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleSum);
        System.out.println("The difference using doubles of " + doubleOperandA + " - " + doubleOperandB + " is " + doubleDifference);
        System.out.println("The product using doubles of " + doubleOperandA + " * " + doubleOperandB + " is " + doubleProduct);
        System.out.println("The quotient using doubles of " + doubleOperandA + " / " + doubleOperandB + " is " + doubleQuotient);
        System.out.println("The remainder using doubles of " + doubleOperandA + " + " + doubleOperandB + " is " + doubleModulo);
    }
}