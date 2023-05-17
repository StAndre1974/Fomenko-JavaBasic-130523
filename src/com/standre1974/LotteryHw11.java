package com.standre1974;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LotteryHw11 {
    public static void main(String[] args) {

        int count = 0;
        int minNumber = 0;
        int maxNumber = 9;

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter the maximum number of lottery(0 - exit): \n");
        int[] lotteryNumbers = new int[checkInputNumberInt(scanner)];
        int[] userNumbers = new int[lotteryNumbers.length];

        if (lotteryNumbers.length > 10) {
            maxNumber = lotteryNumbers.length;
        }

        generateMatrixNumbers(random, lotteryNumbers, minNumber, maxNumber);

        generateMatrixNumbers(random, userNumbers, minNumber, maxNumber);

        sortIntArray(lotteryNumbers);
        System.out.println("Lottery numbers after sorting:\n" + Arrays.toString(lotteryNumbers));
        System.out.println();

        sortIntArray(userNumbers);
        System.out.println("Users numbers after:\n" + Arrays.toString(userNumbers));
        System.out.println();

        System.out.print("Matched elements: { ");
        for (int i = 0; i < lotteryNumbers.length; i++) {
            if (lotteryNumbers[i] == userNumbers[i]) {
                System.out.printf("[%d]:%d ", i, lotteryNumbers[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.print("None ");

        }
        System.out.println("}");
        System.out.printf("Total %d elevtnts matched", count);

    }


    // METHODS
    private static void generateMatrixNumbers(Random random, int[] matrix, int minNumber, int maxNumber) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        }
    }

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

    private static void sortIntArray(int[] arr) {     // int[] arr = {4, 2, 7, 11, 9, 89, 10, 6, 8, 44, 56};  45 cycles
        int intermediateVariable;
//        int count = 0;
        boolean flag = true;
        int end = arr.length - 1;
        while (flag) {
            flag = false;
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    intermediateVariable = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = intermediateVariable;
                    flag = true;
                }
//                count++;
            }
            end--;
        }
//        System.out.println(count);

    }

//    private static void sortIntArray1(int[] arr) {      // int[] arr = {4, 2, 7, 11, 9, 89, 10, 6, 8, 44, 56};  100 cycles
//        int intermediateVariable;
//        int count = 0;
//        int end = arr.length - 1;
//        for (int k = 1; k < arr.length; k++) {
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    intermediateVariable = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = intermediateVariable;
//                }
//                count++;
//            }
//        }
//        System.out.println(count);
//    }


//    private static void sortIntArray2(int[] arr) {      // int[] arr = {4, 2, 7, 11, 9, 89, 10, 6, 8, 44, 56};  55 cycles
//        int intermediateVariable;
//        int count = 0;
//        int end = arr.length - 1;
//        for (int k = 1; k < arr.length; k++) {
//            for (int i = 0; i < arr.length - k; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    intermediateVariable = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = intermediateVariable;
//                }
//                count++;
//            }
//        }
//        System.out.println(count);
//    }


}
