package com.standre1974;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RegbyCommandsHw8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.print("Enter the commands count: ");
        int commandsCount = checkInputNumberInt(scanner);
        if (commandsCount == 0){
            System.out.println("Exit");
            System.exit(0);
        }
        System.out.println("You entered commands count = " + commandsCount);

        System.out.print("Enter the players count: ");
        int playersCount = checkInputNumberInt(scanner);
        System.out.println("You entered payers count = " + playersCount);

        String[] commands = new String[commandsCount];
        int[][] playerNumbers = new int[commandsCount][playersCount];
        String[][] playerNames = new String[commandsCount][playersCount];
        int[][] playerAge = new int[commandsCount][playersCount];

        int minAge = 18;
        int maxAge = 40;

        Random random = new Random();
        for (int i = 0; i < commandsCount; i++) {
            commands[i] = "Command N" + (i + 1);
            System.out.printf("\n%s:\n", commands[i]);
            for (int j = 0; j < playersCount; j++) {
                playerNumbers[i][j] = j + 1;    // add player number
                playerNames[i][j] = generateFirstLastName(random); // add  player First + Last Name
                playerAge[i][j] = generateRandomNumber(random, minAge, maxAge);
                System.out.printf("| Player N%d: ", playerNumbers[i][j]);
                System.out.printf("%s ", playerNames[i][j]);
                System.out.printf("(Age %d years) ", playerAge[i][j]);
            }
            System.out.printf("\nAverage Age %s is %d\n", commands[i], Arrays.stream(playerAge[i]).sum() / playersCount);
        }
    }


    //METHODS
    public static int checkInputNumberInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int enteredNumber = scanner.nextInt();
                if (enteredNumber >= 0) {
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

    public static String generateFirstLastName(Random random) {
        String[] firstNames = {"Harry", "Oliver", "Jack", "Charlie", "Thomas", "Jacob", "Alfie", "Riley", "William",
                "James", "Daniel"};
        String[] lastNames = {"Williams", "Peters", "Gibson", "Martin", "Jordan", "Jackson", "Grant", "Davis", "Collins",
                "Bradley", "Barlow"};
        return firstNames[random.nextInt(firstNames.length)] + " " + lastNames[random.nextInt(firstNames.length)];

    }
}
