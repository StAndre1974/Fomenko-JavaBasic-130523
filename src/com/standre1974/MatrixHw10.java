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

        int[][] initialMatrixAxB = new int[matrixSideA][matrixSideB];
        int[][] matrixBxAx90 = new int[matrixSideB][matrixSideA];

        int minNumber = 0;
        int maxNumber = 1000;
        Random random = new Random();

        for (int i = 0; i < matrixSideA; i++) {
            for (int j = 0; j < matrixSideB; j++) {
                initialMatrixAxB[i][j] = generateRandomNumber(random, minNumber, maxNumber);
            }
        }

        for (int j = 0; j < matrixSideB; j++) {
            for (int k = 0; k < matrixSideA; k++) {
                matrixBxAx90[j][k] = initialMatrixAxB[matrixSideA - k - 1][j];
            }
        }

        System.out.print("\nINITIAL MATRIX:\n");
        for (int i = 0; i < matrixSideA; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrixSideB; j++) {
                System.out.printf("%03d ", initialMatrixAxB[i][j]);
            }
            System.out.println("|");
        }

        System.out.print("\nTRANSPOSED 90 MATRIX:\n");
        for (int j = 0; j < matrixSideB; j++) {
            System.out.print("|");
            for (int i = 0; i < matrixSideA; i++) {
                System.out.printf("%4d", matrixBxAx90[j][i]);   //можливо цей варіант виводу краще
            }
            System.out.println(" |");
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
