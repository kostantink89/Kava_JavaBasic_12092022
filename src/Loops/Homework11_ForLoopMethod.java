package Loops;

import java.util.Random;
import java.util.Scanner;

public class Homework11_ForLoopMethod {
    public static void main(String[] args) {
        // Method #1
//        Random randomNumber = new Random();
//        int number = randomNumber.nextInt(10);
//        System.out.print("Choose a number between 1 and 10: ");
//        Scanner scan = new Scanner(System.in);
//        int guess = scan.nextInt();
//
//        while (guess != number) {
//            System.out.print("Guess again: ");
//            guess = scan.nextInt();
//        }
//
//        System.out.println("You got it!");
//        scan.close();

//        // Method #2
//        Scanner scan = new Scanner(System.in);
//        Random randomNumber = new Random();
//        int number = randomNumber.nextInt(10);
//        System.out.print("Choose a number between 1 and 10: ");
//        int guess = scan.nextInt();
//        for (int i = 0; i <= number; i++) {
//            if (guess != number) {
//                System.out.print("Guess again: ");
//                guess = scan.nextInt();
//            } else {
//                System.out.println("You got it boss!");
//                break;
//            }
//
//        }

        // Method #3
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        int guess = 0;

        do {
            System.out.print("Enter a number between 1 and 10: ");
            guess = input.nextInt();
        } while (guess != randomNumber);
        System.out.println("You got it boss!");
    }
}









