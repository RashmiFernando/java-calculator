import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // variable declaration & initiation
        double number1 = 0;
        double number2 = 0;
        char operator;
        double result = 0;

        // user inputs
        Scanner scannerObject = new Scanner(System.in);

        System.out.print("Enter first number  : ");
        number1 = scannerObject.nextDouble();

        System.out.print("Enter operator      : ");
        operator = scannerObject.next().charAt(0);

        System.out.print("Enter second number : ");
        number2 = scannerObject.nextDouble();

        // calculation
        Operations operationsObject = new Operations();

        switch (operator) {
            case '+' -> result = operationsObject.addition(number1, number2);
            case '-' -> result = operationsObject.subtraction(number1, number2);
            case '*' -> result = operationsObject.multiplication(number1, number2);
            case '/' -> result = operationsObject.division(number1, number2);
            default -> {
                System.out.println("Invalid operator");
            }
        }

        // display output
        System.out.println("Answer is         : " + result);

        scannerObject.close();
    }
}