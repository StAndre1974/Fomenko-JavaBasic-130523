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
 */

import java.util.Arrays;
import java.util.Scanner;

public class LotteryHw11 {
    public static void main(String[] args) {


        int[] arr = {4, 2, 7, 11, 9, 89, 10, 6, 8, 44, 56};
        System.out.println(Arrays.toString(arr));
        sortIntArray(arr);
        System.out.println(Arrays.toString(arr));

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

//    private static void sortIntArray(int[] arr) {      // int[] arr = {4, 2, 7, 11, 9, 89, 10, 6, 8, 44, 56};  100 cycles
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


//    private static void sortIntArray(int[] arr) {      // int[] arr = {4, 2, 7, 11, 9, 89, 10, 6, 8, 44, 56};  55 cycles
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
