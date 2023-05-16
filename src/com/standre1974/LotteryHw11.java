package com.standre1974;

/*
Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
Перший масив - це числа, які загадані фірмою-організатором лотереї.
Другий масив - це числа, які вгадав гравець.
Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом; Наприклад:
first[3] повинен дорівнювати second[3], як показано нижче.
Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
[0, 1, 4, 5, 5, 8, 9]

[1, 1, 2, 3, 5, 6, 9]

Кількість збігів: 3

- ввести кількість номерів лотереї (maxLotteryNumbers)
- ввести кількість номерів, які повинен вгадати користувач (userNumbersGuess)
- створити метод генерації номерів лотереї (0-max)
- створити метод генерації номерів user (0-max)
- створити метод генерації індексів, які заповнив user

 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LotteryHw11 {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter the maximum number of lottery(0 - exit): \n");
        int[] lotteryNumbers = new int[checkInputNumberInt(scanner)];
        int minNumber = 1;
        int maxNumber = lotteryNumbers.length;

        for (int i = 0; i < lotteryNumbers.length; i++) {
                lotteryNumbers[i] = generateRandomNumber(random, minNumber, maxNumber);
            }
//        int[] lotteryNumbers1 = lotteryNumbers;
//        int[] lotteryNumbers2 = lotteryNumbers;

        System.out.println("lotteryNumbers before:\n" + Arrays.toString(lotteryNumbers));
        sortIntArray(lotteryNumbers);
        System.out.println("lotteryNumbers after:\n" + Arrays.toString(lotteryNumbers));
        System.out.println();


//        System.out.println("lotteryNumbers before1:\n" + Arrays.toString(lotteryNumbers1));
//        sortIntArray1(lotteryNumbers1);
//        System.out.println("lotteryNumbers after1:\n" + Arrays.toString(lotteryNumbers1));
//        System.out.println();
//
//        System.out.println("lotteryNumbers before2:\n" + Arrays.toString(lotteryNumbers2));
//        sortIntArray2(lotteryNumbers2);
//        System.out.println("lotteryNumbers after2:\n" + Arrays.toString(lotteryNumbers2));
//        System.out.println();




    }
    // METHODS

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

    private static void sortIntArray(int[] arr) {     // int[] arr = {4, 2, 7, 11, 9, 89, 10, 6, 8, 44, 56};  45 cycles
        int intermediateVariable;
        int count = 0;

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
                count++;

            }
            end--;
        }
        System.out.println(count);

    }

    private static void sortIntArray1(int[] arr) {      // int[] arr = {4, 2, 7, 11, 9, 89, 10, 6, 8, 44, 56};  100 cycles
        int intermediateVariable;
        int count = 0;
        int end = arr.length - 1;
        for (int k = 1; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    intermediateVariable = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = intermediateVariable;
                }
                count++;
            }
        }
        System.out.println(count);
    }


    private static void sortIntArray2(int[] arr) {      // int[] arr = {4, 2, 7, 11, 9, 89, 10, 6, 8, 44, 56};  55 cycles
        int intermediateVariable;
        int count = 0;
        int end = arr.length - 1;
        for (int k = 1; k < arr.length; k++) {
            for (int i = 0; i < arr.length - k; i++) {
                if (arr[i] > arr[i + 1]) {
                    intermediateVariable = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = intermediateVariable;
                }
                count++;
            }
        }
        System.out.println(count);
    }


}
