package com.standre1974;

import java.util.Arrays;
import java.util.Random;

public class LotteryHw11 {
    public static void main(String[] args) {

        int count = 0;
        int minNumber = 0;
        int maxNumber = 9;

        Random random = new Random();

        int[] lotteryNumbers = new int[7];
        int[] userNumbers = new int[7];

        fillArray(random, lotteryNumbers, minNumber, maxNumber);

        fillArray(random, userNumbers, minNumber, maxNumber);

        System.out.printf("Lottery numbers:\n%s\n", Arrays.toString(lotteryNumbers));
        sortIntArray(lotteryNumbers);
        System.out.printf("Lottery numbers after sorting:\n%s\n\n", Arrays.toString(lotteryNumbers));

        System.out.printf("Users numbers:\n%s\n", Arrays.toString(userNumbers));
        sortIntArray(userNumbers);
        System.out.printf("Users numbers after sorting:\n%s\n\n", Arrays.toString(userNumbers));

        for (int i = 0; i < lotteryNumbers.length; i++) {
            if (lotteryNumbers[i] == userNumbers[i]) {
                count++;
            }
        }

        if (count == 0) {
            System.out.print("Matched elements: None");
        } else {
            System.out.print("Matched elements: ");
            for (int i = 0; i < lotteryNumbers.length; i++) {
                if (lotteryNumbers[i] == userNumbers[i]) {
                    System.out.printf("%d ", i);
                }
            }
        }

        System.out.printf("\n\nTotal %d elements matched\n\n", count);

    }

    private static void fillArray(Random random, int[] matrix, int minNumber, int maxNumber) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        }
    }

    private static void sortIntArray(int[] arr) {
        boolean flag = true;
        int end = arr.length - 1;
        while (flag) {
            flag = false;
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    flag = true;
                }
            }
            end--;
        }
    }

}
