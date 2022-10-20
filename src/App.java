import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        operations operation = new operations();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What operation would you like to perform?");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. EXIT");
        int entry = myScanner.nextInt();

        System.out.println("Your first operand?");
        float operandone = myScanner.nextFloat();
        System.out.println("Your second operand?");
        float operandtwo = myScanner.nextFloat();

        switch(entry){
            case 1:
                System.out.println("The sum is: " + operation.addition(operandone, operandtwo));
                break;
            case 2:
                System.out.println("The difference is: " + operation.substraction(operandone, operandtwo));
                break;
            case 3:
                System.out.println("The multiplication is equal to: " + operation.multiplication(operandone, operandtwo));
                break;
            case 4:
                System.out.println("The division is equal to: " + operation.division(operandone, operandtwo));
                break;
            case 5:
                System.out.println("CIAO!");
                break;
            default:
                System.out.println("UNKNOWN COMMAND");
        }
    }
}