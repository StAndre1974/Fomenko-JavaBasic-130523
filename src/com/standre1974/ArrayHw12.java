package com.standre1974;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/*
Створити двомірний ступінчатий масив випадкових чисел розміру NxM*, де:

N - кількість рядків (вводимо з консолі);
M - максимальна кількість елементів в рядку (також вводимо з консолі). Для кожного рядка кількість елементів має бути
випадковим числом M* в діапазоні 0 <= M* < M.
Створити наступні методи для роботи з масивом:

відсортувати парні рядки за зростанням, а непарні за спаданням;
обчислити суму всіх елементів двовимірного ступінчастого масива;
знайти мінімальний елементи для кожного рядка (результат має бути масивом) та мінімальний елемент серед усіх елементів
(абсолютний мінімум)
якщо можливо, то поділити всі елементи ступінчатого масиву на абсолютний мінімум націло

 */

public class ArrayHw12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        Random random = new Random();

        System.out.print("Enter the count of Array rows (0 - exit): \n");
//        int maxCountArrayRows = checkInputNumberInt(scanner);

        int[][] array = new int[checkInputNumberInt(scanner)][];

        System.out.print("Enter the maximum row length of Array (0 - exit): \n");
        int maxLengthRow = checkInputNumberInt(scanner);

        for (int i = 0; i < array.length; i++) {
            array[i] = createRandomArray(random, 0, maxLengthRow);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(Arrays.toString(array[i]));
        }

//            System.out.print(Arrays.toString(array));

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

    public static int[] createRandomArray(Random random, int minValue, int maxValue) {
        int multiplierRND = 10;
        int[] array = new int[random.nextInt(maxValue - minValue + 1) + minValue];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue * multiplierRND - minValue + 1) + minValue;
        }
        return array;
    }


}
