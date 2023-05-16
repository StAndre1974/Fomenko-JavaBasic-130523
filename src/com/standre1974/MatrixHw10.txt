package com.standre1974;

import java.util.Random;
import java.util.Scanner;

public class MatrixHw10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter the Height and the Width of the Matrix(0 - exit): \n");

        int[][] matrix = new int[checkInputNumberInt(scanner)][checkInputNumberInt(scanner)];

        int minNumber = 0;
        int maxNumber = 1000;
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = generateRandomNumber(random, minNumber, maxNumber);
            }
        }
        int[][] transposedMatrix = transposeMatrix(matrix);


        System.out.print("\nINITIAL MATRIX:\n");
        printMatrix(matrix);

        System.out.print("\nTRANSPOSED MATRIX:\n");
        printMatrix(transposedMatrix);
    }

    //METHODS
    public static int checkInputNumberInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int enteredNumber = scanner.nextInt();
                if (enteredNumber == 0) {
                    System.exit(0);
                } else if (enteredNumber > 0) {
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

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.print("|");
            for (int k = 0; k < matrix[0].length; k++) {
                System.out.printf("%4d", ints[k]);
            }
            System.out.println(" |");
        }

    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int j = 0; j < matrix[0].length; j++) {
            for (int k = 0; k < matrix.length; k++) {
                transposedMatrix[j][k] = matrix[k][j];
            }
        }
        return transposedMatrix;
    }
}
