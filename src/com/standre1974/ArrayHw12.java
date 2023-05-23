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
        int maxColums = readInt(scanner);

        int[][] array;

        System.out.print("Enter the maximum row length of Array (0 - exit): \n");
        int maxRowLength = readInt(scanner);

        System.out.print("\n");
        array = generateMatrix(random, maxRowLength, maxColums);

        System.out.print("Unsorted Array:\n");
        outArrayToString(array);
        System.out.print("\n");

        sortIntMatrix(array, 0, true);

        sortIntMatrix(array, 1, false);

        System.out.print("Sorted Array:\n");
        outArrayToString(array);
        System.out.print("\n");

        System.out.println("Sum of array elements = " + sumArray(array));
        System.out.print("\n");

        int[] minNumbersArray = createArrayWithMinNumbers(array);
        System.out.println("Min numbers Array " + Arrays.toString(minNumbersArray));
        System.out.print("\n");

        int absoluteMinimum = minIntArray(minNumbersArray);
        System.out.println("Absolute minimum =" + absoluteMinimum);
        System.out.print("\n");

        System.out.printf("INTEGER ARRAY DIVISION BY %d:\n", absoluteMinimum);
        System.out.println("Before divided: ");
        outArray(array);
        System.out.println("After divided: ");
        outArray(divideMatrix(array, absoluteMinimum));

    }

    public static int readInt(Scanner scanner) {
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

    public static int[][] generateMatrix(Random random, int rows, int maxColumns) {
        int[][] array = new int[maxColumns][rows];
        for (int i = 0; i < maxColumns; i++) {
            int size = generateRandomNumber(random, 0, rows);
            array[i] = new int[size];
        }

        for (int i = 0; i < maxColumns; i++) {
            for (int k = 0; k < array[i].length; k++) {
                array[i][k] = generateRandomNumber(random, 0, rows);
            }
        }
        return array;
    }

    public static void outArrayToString(int[][] array) {
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

    public static void outArray(int[][] array) {
        System.out.println("[");
        for (int[] row : array) {
            System.out.print("   {");
            for (int cell : row) {
                System.out.printf("%4d", cell);
            }
            System.out.println("}");
        }
        System.out.println("]");
    }

    private static void sortIntMatrix(int[][] array, int Odd1Even0, boolean ascTrueDesFalse) {
        for (int i = Odd1Even0; i < array.length; i += 2) {
            boolean flag = true;
            int end = array[i].length - 1;
            while (flag) {
                flag = false;
                for (int k = 0; k < end; k++) {
                    if ((array[i][k] > array[i][k + 1]) == ascTrueDesFalse) {
                        int tmp = array[i][k];
                        array[i][k] = array[i][k+1];
                        array[i][k+1] = tmp;
                        flag = true;
                    }
                }
                end--;
            }
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

    private static Integer minIntArray(int[] array) {
        if (array.length == 0) {
            return null;        // ДЯКУЮ ЗА ЦІННУ ПОРАДУ)
        }
        int min = array[0];
        for (int number : array) {
            if (min > number) {
                min = number;
            }
        }
        return min;
    }

    private static int[] createArrayWithMinNumbers(int[][] array) {
        int counter = 0;
        for (int[] elementsLv2 : array) {
            if (elementsLv2.length > 0) {
                counter++;
            }
        }
        int[] minNumbersArray = new int[counter];

        counter = 0;
        for (int[] elements : array) {
            if (elements.length > 0) {
                minNumbersArray[counter] = minIntArray(elements);
                counter++;
            }
        }
        return minNumbersArray;
    }

    private static int[][] divideMatrix(int[][] array, int divider) {
        if (divider > 0) {
            for (int[] row : array) {
                if (row.length > 0) {
                    for (int i = 0; i < row.length; i++) {
                        row[i] = row[i] / divider;
                    }
                }
            }
        } else {
            System.out.printf("Absolute minimum = %d, cannot be divided by 0\n", divider);
            System.out.print("Array has not changed:\n");
        }
        return array;
    }

}