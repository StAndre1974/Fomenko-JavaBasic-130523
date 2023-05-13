package com.standre1974;

import java.util.Random;
import java.util.Scanner;
public class MatrixHw10 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter the initial Matrix Height (0 - exit): ");
        int matrixSideA = checkInputNumberInt(scanner);
        if (matrixSideA == 0) {
            System.out.println("Exit");
            System.exit(0);
        }
        System.out.println("You entered Matrix Height = " + matrixSideA);

        System.out.print("Enter the initial Matrix Width (0 - exit): ");
        int matrixSideB = checkInputNumberInt(scanner);
        System.out.println("You entered Matrix Width = " + matrixSideB);
        if (matrixSideB == 0) {
            System.out.println("Exit");
            System.exit(0);
        }

    }

    //METHODS
    public static int checkInputNumberInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int enteredNumber = scanner.nextInt();
                if (enteredNumber >= 0) {
                    return enteredNumber;
                }
            }
            System.out.println("Enter valid number or 0 to exit");
            scanner.nextLine();
        }
    }

    public static int generateRandomNumber(Random random, int minValue, int maxValue) {
        return random.nextInt(maxValue - minValue + 1) + minValue;
    }
}
