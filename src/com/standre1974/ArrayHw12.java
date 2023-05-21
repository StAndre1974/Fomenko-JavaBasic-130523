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

// СТВОРЕНННЯ ВКЛАДЕНИХ МАСИВІВ
        for (int i = 0; i < array.length; i++) {
            array[i] = createRandomArray(random, 0, maxLengthRow);
        }

        System.out.print("\n");

// ЗАПОВНЕННЯ ВКЛАДЕНИХ МАСИВІВ
        for (int i = 0; i < array.length; i++) {
            fillArray(array[i], random, 0, maxLengthRow);
        }
        outArray(array);

        System.out.print("Sorted:\n");


// СОРТУВАННЯ ВКЛАДЕНИХ МАСИВІВ ЗА ЗРОСТАННЯМ (ПАРНІ РЯДКИ) ТА ЗА СПАДАННЯМ (НЕПАРНІ РЯДКИ)
        sortUpIntArray2D(array);

        sortDownIntArray2D(array);

        outArray(array);

// СУМА ВСИХ ЕЛЕМЕНТІВ МАСИВУ

        System.out.print("Sum of array elements = " + sumArray(array));

        System.out.print("\n");

// МІНІМУМ ЕЛЕМЕНТІВ МАСИВУ

        int counter = countArraysNonNull(array);
        System.out.println("Counter1 = " + counter);

        int[] minNumbersArray = extractMinNumbers(array);
        System.out.println("Min numbers Array " + Arrays.toString(minNumbersArray));

// АБСОЛЮТНИЙ МІНІМУМ ЕЛЕМЕНТІВ МАСИВУ
        int absoluteMinimum = minIntArray(minNumbersArray);
        System.out.println("Absolute minimum =" + absoluteMinimum);

// ДІЛЕННЯ МАССИВУ НА АБСОЛЮТНИЙ МІНІМУМ ЕЛЕМЕНТІВ МАСИВУ
        if (absoluteMinimum > 0) {
            int[][] dividedArray = array;
            for (int[] elementsLv1 : array) {
                System.out.println("Before divided " + Arrays.toString(elementsLv1));
                if (elementsLv1.length > 0) {
                    for (int i = 0; i < elementsLv1.length; i++) {
                        elementsLv1[i] = elementsLv1[i] / absoluteMinimum;
                    }
                }else
                    System.out.println("After divided " + Arrays.toString(elementsLv1));
            }

        }else {
            System.out.printf("Absolute minimum = %d, cannot be divided by 0",absoluteMinimum);
        }


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
        int[] array = new int[generateRandomNumber(random, minValue, maxValue)];
        return array;
    }

    public static void fillArray(int[] array, Random random, int minValue, int maxValue) {
        int multiplierRND = 1;
        int booster = 0;    // параметр впливає на значення абсолютного мінімума (збільшити, щоб виключити значення 0)
        for (int i = 0; i < array.length; i++) {
            array[i] = generateRandomNumber(random, minValue, maxValue) * multiplierRND + booster;
        }
    }

    public static void outArray(int[][] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int k = 0; k < array[i].length; k++) {
                System.out.printf("%4d", array[i][k]);
            }
            System.out.print("}");
        }
        System.out.print("]\n");
    }

    private static void sortUpIntArray(int[] array) {
        boolean flag = true;
        int end = array.length - 1;
        while (flag) {
            flag = false;
            for (int i = 0; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    flag = true;
                }
            }
            end--;
        }
    }

    private static void sortDownIntArray(int[] array) {
        boolean flag = true;
        int end = array.length - 1;
        while (flag) {
            flag = false;
            for (int i = 0; i < end; i++) {
                if (array[i] < array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    flag = true;
                }
            }
            end--;
        }
    }

    private static void sortUpIntArray2D(int[][] array) {
        for (int i = 0; i < array.length; i = i + 2) {
            sortUpIntArray(array[i]);
        }
    }

    private static void sortDownIntArray2D(int[][] array) {
        for (int i = 1; i < array.length; i = i + 2) {
            sortDownIntArray(array[i]);
        }
    }

    private static int sumArray(int[][] array) {
        int sumArray = 0;
        for (int[] elementsLv1 : array) {
            for (int elementsLv2 : elementsLv1) {
                sumArray = sumArray + elementsLv2;
            }
        }
        return sumArray;

    }

    private static int countArraysNonNull(int[][] array) {
        int counter = 0;
        for (int[] elementsLv2 : array) {
            if (elementsLv2.length > 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int minIntArray(int[] array) {
        int min = array[0];
        for (int number : array) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

//    private static int[] minIntArray2D(int[][] array) {
//        int counter = countArraysNonNull(array);
//        int[] minNumbersArray = new int[counter];
//        counter = 0;
//        for (int[] elementLv2 : array) {
//            if (elementLv2.length > 0) {
//                minNumbersArray[counter] = minIntArray(elementLv2);
//                counter++;
//            }
//        }
//        return minNumbersArray;
//    }

    private static int[] extractMinNumbers(int[][] array) {
        int counter;
        int[] minNumbersArray = new int[countArraysNonNull(array)];
//        System.out.println("minNumbersArray =" + Arrays.toString(minNumbersArray));
//
        counter = 0;
//        System.out.println("Counter2 = " + counter);

        for (int[] elements : array) {
            if (elements.length > 0) {
                minNumbersArray[counter] = minIntArray(elements);
                counter++;
            }
        }
        return minNumbersArray;
    }


}