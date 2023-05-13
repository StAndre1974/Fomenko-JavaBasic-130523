package com.standre1974;

import java.util.Scanner;

public class ParalepipedHw3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть першу сторону паралелепіпеду:");
        float side1 = scan.nextFloat();
        System.out.println("Перша сторона паралелепіпеду = " + side1);

        System.out.println("\nВведіть другу сторону паралелепіпеду:");
        float side2 = scan.nextFloat();
        System.out.println("Друга сторона паралелепіпеду = " + side2);

        System.out.println("\nВведіть третю сторону паралелепіпеду:");
        float side3 = scan.nextFloat();
        System.out.println("Третя сторона паралелепіпеду = " + side3);

        float volume = side1 * side2 * side3;
        System.out.println("\nОб'єм паралелепіпеда = " + volume);

        float length = 4 * (side1 + side2 + side3);
        System.out.println("\nПериметр паралелепіпеда = " + length);

    }
}
