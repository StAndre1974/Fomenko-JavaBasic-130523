package com.standre1974;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {

        int minNumber = 1;
        int maxNumber = 10;


        Scanner scanner = new Scanner(System.in);
        int userNumber = scanInputInt("Enter the Number: ", scanner);
        System.out.println(userNumber);

    }


    public static int scanInputInt(String inputText, Scanner scanner) {
        scanner.useDelimiter("\n");    // без цього рядка приймало "54 + якийсь інший текст"
        System.out.print(inputText);

        while (!scanner.hasNextInt()) {
            System.out.println(scanner.nextLine() + " - is ivalid value");
            System.out.print("Enter a valid value: ");
        }
        return scanner.nextInt();

    }


//    public static int scanInputInt(String nameInputOption) {
//        Scanner scan = new Scanner(System.in);
//        scan.useDelimiter("\n");    // без цього рядка приймає "34 + ще якийсь текст"
//        System.out.print(nameInputOption);
//
//        try {
//            scan.hasNextInt();
//            return scan.nextInt();
//        }
//        catch (Exception e) {
//            System.out.println("Invalid value entered");
//        }
//        return scanInputInt(nameInputOption);
//    }


}
