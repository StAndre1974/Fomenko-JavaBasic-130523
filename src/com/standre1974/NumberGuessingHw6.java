package com.standre1974;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingHw6 {
    public static void main(String[] args) {

        int minRandomNumber = 1;
        int maxRandomNumber = 10;
        int numberAttempts = 3;

        String introText = String.format("Enter your Number from %d to %d", minRandomNumber, maxRandomNumber);

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = generationRandomNumber(random, minRandomNumber, maxRandomNumber);
//        System.out.printf("Random number = %d\n", randomNumber); / сгенероване число, розкоментити для перевірки коду

        while (numberAttempts > 0) {
            System.out.printf("%s (attempts left %d):", introText, numberAttempts);
            int userNumber = scanInputInt(scanner);
            if (checkInputRange(userNumber, minRandomNumber, maxRandomNumber)) {
                --numberAttempts;
                scanner.nextLine();     // рядок для очищення System.in
                if (compareRandomUserNumbers(randomNumber, userNumber, numberAttempts)) {
                    break;
                }
            } else {
                scanner.nextLine();     // рядок для очищення System.in
                System.out.printf("%d - value out of range\n", userNumber);
            }

        }

    }


    public static int generationRandomNumber(Random random, int minValue, int maxValue) {
        return random.nextInt(maxValue - minValue + 1) + minValue;
    }

    private static boolean compareRandomUserNumbers(int randomNumber, int userNumber, int numberAttempts) {
        if (userNumber == randomNumber) {
            System.out.printf("CONGRATULATION! YOU GUESSED THE NUMBER %d", userNumber);
            return true;
        } else if (numberAttempts == 0) {
            System.out.printf("Number %d is wrong\nCorrect number = %d\n\"YOU LOSE!!!\"", userNumber, randomNumber);
            return false;
        } else {
            System.out.printf("Number %d is wrong\n", userNumber);
            return false;
        }
    }

    public static boolean checkInputRange(int intNumber, int minValue, int maxValue) {
        return minValue < intNumber && intNumber < maxValue;
    }

    public static int scanInputInt(Scanner scanner) {
        scanner.useDelimiter("\n");
        while (!scanner.hasNextInt()) {
            System.out.println(scanner.nextLine() + " - is invalid value");
            System.out.print("Enter a valid value: ");
        }
        return scanner.nextInt();
    }


}
