package com.standre1974;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class ArrayHw12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        Random random = new Random();

        System.out.print("Enter the count of Array rows (0 - exit): \n");

        int[][] array = new int[checkInputNumberInt(scanner)][];

        System.out.print("Enter the maximum row length of Array (0 - exit): \n");
        int maxLengthRow = checkInputNumberInt(scanner);

        for (int i = 0; i < array.length; i++) {
            array[i] = createRandomArray(random, 0, maxLengthRow);
        }

        System.out.print("\n");

        for (int[] element : array) {
            fillArray(element, random, 0, maxLengthRow);
        }
        System.out.print("Unsorted Array:\n");
        outArray(array);
        System.out.print("\n");

        sortUpIntArray2D(array);

        sortDownIntArray2D(array);

        System.out.print("Sorted Array:\n");
        outArray(array);
        System.out.print("\n");

        System.out.println("Sum of array elements = " + sumArray(array));
        System.out.print("\n");

        int[] minNumbersArray = extractMinNumbers(array);
        System.out.println("Min numbers Array " + Arrays.toString(minNumbersArray));
        System.out.print("\n");

        int absoluteMinimum = minIntArray(minNumbersArray);
        System.out.println("Absolute minimum =" + absoluteMinimum);
        System.out.print("\n");

        System.out.printf("INTEGER ARRAY DIVISION BY %d:\n", absoluteMinimum);
        System.out.println("Before divided: ");
        outArray(array);
        System.out.println("After divided: ");
        outArray(divideArray2D(array, absoluteMinimum));

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

    public static int generateRandomNumber(Random random, int minValue, int maxValue) {
        return random.nextInt(maxValue - minValue + 1) + minValue;
    }

    public static int[] createRandomArray(Random random, int minValue, int maxValue) {
        return new int[generateRandomNumber(random, minValue, maxValue)];
    }

    public static void fillArray(int[] array, Random random, int minValue, int maxValue) {
        int multiplierRND = 1;
        int booster = 0;    // ЗБІЛЬШУЄ АБСОЛЮТНИЙ МІНІМУМ (ДЛЯ ПЕРЕВІРКИ РОБОТИ КОДУ)
        for (int i = 0; i < array.length; i++) {
            array[i] = generateRandomNumber(random, minValue, maxValue) * multiplierRND + booster;
        }
    }

    public static void outArray(int[][] array) {
        System.out.print("[");
        for (int[] elementLv1 : array) {
            System.out.print("{");
            for (int elementLv2 : elementLv1) {
                System.out.printf("%4d", elementLv2);
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

    private static int[] extractMinNumbers(int[][] array) {
        int counter;
        int[] minNumbersArray = new int[countArraysNonNull(array)];
        counter = 0;

        for (int[] elements : array) {
            if (elements.length > 0) {
                minNumbersArray[counter] = minIntArray(elements);
                counter++;
            }
        }
        return minNumbersArray;
    }

    private static int[][] divideArray2D(int[][] array, int divider) {
        int[][] dividedArray = array;
        if (divider > 0) {
            for (int[] elementsLv1 : dividedArray) {
                if (elementsLv1.length > 0) {
                    for (int i = 0; i < elementsLv1.length; i++) {
                        elementsLv1[i] = elementsLv1[i] / divider;
                    }
                }
            }
        } else {
            System.out.printf("Absolute minimum = %d, cannot be divided by 0\n", divider);
            System.out.print("Array has not changed:\n");
        }
        return dividedArray;
    }


}