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

import java.lang.reflect.Array;
import java.util.Arrays;

public class LotteryHw11 {
    public static void main(String[] args) {


        int[] arr = {4, 2, 7, 11, 9, 12, 3, 4, 23, 67, 89, 10, 6, 8, 44, 56};
        int intermediateVariable;
        int count = 0;

        boolean flag = true;
        int end = arr.length;
        while (flag) {
            flag = false;
            for (int i = 0; i < end - 1; i++) {
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
        System.out.println(Arrays.toString(arr));
        System.out.println(count);



    }

    public static void sortIntArray(int[] array) {
        int intermediateVariable;
        while (true) {
            boolean flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    intermediateVariable = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = intermediateVariable;

                }
                flag = true;
            }

        }
    }
}
