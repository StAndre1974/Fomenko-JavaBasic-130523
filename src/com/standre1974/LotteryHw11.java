package com.standre1974;

import java.util.Random;
import java.util.Scanner;

public class LotteryHw11 {
    public static void main(String[] args){


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
}
