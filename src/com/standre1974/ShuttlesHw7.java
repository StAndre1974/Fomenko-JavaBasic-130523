package com.standre1974;

public class ShuttlesHw7 {
    public static void main(String[] args) {
        int numberOfShuttles = 100;
        int[] prohibitedNumbers = {4, 9};
        int[] shuttles = new int[numberOfShuttles];
        int numberToCheck = 0;
        int currentShuttleNumber = 0;

        while (numberOfShuttles > currentShuttleNumber) {
            ++numberToCheck;
            while (isNotValid(prohibitedNumbers, numberToCheck)) {
                ++numberToCheck;
            }
            shuttles[currentShuttleNumber] = numberToCheck;
            ++currentShuttleNumber;
        }

        System.out.println("LIST OF SHUTTLES:");
        for (int shuttleNumber : shuttles) {
            System.out.printf("Shuttle number %03d\n", shuttleNumber);
        }
        System.out.printf("TOTAL SHUTTLES: %d", shuttles.length);
    }


    private static boolean isNotValid(int[] prohibitedNumbers, int numberToCheck) {
        String numberToCheckString = Integer.toString(numberToCheck);
        for (int valueProhibitedNumbers : prohibitedNumbers) {
            String prohibitedNumberString = Integer.toString(valueProhibitedNumbers);
            if (numberToCheckString.contains(prohibitedNumberString)) {
                return true;
            }
        }
        return false;
    }

}


