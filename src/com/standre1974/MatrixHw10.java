package com.standre1974;

import java.util.Random;
import java.util.Scanner;
public class MatrixHw10 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter the Width and the Height of the Matrix(0 - exit): \n");

        int[][] matrix = new int[checkInputNumberInt(scanner)][checkInputNumberInt(scanner)];
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];

        int minNumber = 0;
        int maxNumber = 1000;
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = generateRandomNumber(random, minNumber, maxNumber);
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            for (int k = 0; k < matrix.length; k++) {
                transposedMatrix[j][k] = matrix[matrix.length - k - 1][j];
            }
        }

        System.out.print("\nINITIAL MATRIX:\n");
        for (int[] ints : matrix) {
            System.out.print("| ");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%03d ", ints[j]);
            }
            System.out.println("|");
        }

        System.out.print("\nTRANSPOSED 90 MATRIX:\n");
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print("|");
            for (int i = 0; i < matrix.length; i++) {
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
