package lesson3;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float firstNumber, secondNumber, result;


        System.out.print("Please enter your first number: ");
        firstNumber = scan.nextFloat();
        System.out.print("Please enter arithmetic operation: ");
        char arithmeticOperation = scan.next().charAt(0);
        System.out.print("Please enter your second number: ");
        secondNumber = scan.nextFloat();


        switch (arithmeticOperation) {
            case '+':
                float addition = firstNumber + secondNumber;
                System.out.println("Result of addition = " + addition);
                break;

            case '-':
                float subtraction = firstNumber - secondNumber;
                System.out.println("Result of subtraction = " + subtraction);
                break;

            case '*':
                float multiplication = firstNumber * secondNumber;
                System.out.println("Result of multiplication = " + multiplication);
                break;

            case '/':
                float division = firstNumber / secondNumber;
                System.out.println("Result of division = " + division);
                break;

            default:
                System.out.println("You entered incorrect value");
                break;

        }


    }
}
