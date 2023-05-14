package com.standre1974;

import java.util.Random;
import java.util.Scanner;
public class MatrixHw10 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter the initial Matrix Height (0 - exit): ");
        int sideA = checkInputNumberInt(scanner);
        System.out.println("You entered Matrix Height = " + sideA);

        System.out.print("Enter the initial Matrix Width (0 - exit): ");
        int sideB = checkInputNumberInt(scanner);
        System.out.println("You entered Matrix Width = " + sideB);

        int[][] matrix = new int[sideA][sideB];
        int[][] transposedMatrix = new int[sideB][sideA];

        int minNumber = 0;
        int maxNumber = 1000;
        Random random = new Random();

        for (int i = 0; i < sideA; i++) {
            for (int j = 0; j < sideB; j++) {
                matrix[i][j] = generateRandomNumber(random, minNumber, maxNumber);
            }
        }

        for (int j = 0; j < sideB; j++) {
            for (int k = 0; k < sideA; k++) {
                transposedMatrix[j][k] = matrix[sideA - k - 1][j];
            }
        }

        System.out.print("\nINITIAL MATRIX:\n");
        for (int i = 0; i < sideA; i++) {
            System.out.print("| ");
            for (int j = 0; j < sideB; j++) {
                System.out.printf("%03d ", matrix[i][j]);
            }
            System.out.println("|");
        }

        System.out.print("\nTRANSPOSED 90 MATRIX:\n");
        for (int j = 0; j < sideB; j++) {
            System.out.print("|");
            for (int i = 0; i < sideA; i++) {
                System.out.printf("%4d", transposedMatrix[j][i]);   //можливо цей варіант виводу краще
            }
            System.out.println(" |");
        }



    }

    //METHODS
    public static int checkInputNumberInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int enteredNumber = scanner.nextInt();
                if (enteredNumber == 0) {
                    System.exit(0);
                }else {
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
