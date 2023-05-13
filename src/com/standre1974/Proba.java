package com.standre1974;

import java.util.Scanner;

public class Proba {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        scanner.useDelimiter("\n");

        System.out.print("Enter the initial Matrix Height (0 - exit): ");
        int matrixSideA = readInt(scanner);
        System.out.println("matrixSideA = " + matrixSideA);

        if (matrixSideA == 0) {
            System.out.println("Exit");
            System.exit(0);
        }


    }
        public static int readInt (Scanner scanner){
            while (true) {
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    if (number > 0 && number < 1000) {
                        return number;
                    }
                }
                System.out.println("Valid Number");
                scanner.nextLine();
            }
        }


}
