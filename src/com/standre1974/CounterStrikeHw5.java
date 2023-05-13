package com.standre1974;

import java.util.Scanner;

public class CounterStrikeHw5 {
    public static void main(String[] args) {

        int maxFrag = 0;
        int maxIndexFrag = 0;

        int numberTeams = scanInputInt("Enter the number of teams: ");

        if (numberTeams > 0) {

            int[] totalTeamFrags = new int[numberTeams];
            String[] totalNamesOfTeams = new String[numberTeams];
            int[] totalPlayersInTeam = new int[numberTeams];

            for (int teamNumber = 1; teamNumber <= numberTeams; teamNumber++) {
                int totalFrags = 0;
                String nameTeam = scanInputString("Enter name Team" + teamNumber + ": ");
                int numberPlayers = scanInputInt("  Enter the number of team" + teamNumber + " players: ");

                for (int playerNumber = 1; playerNumber <= numberPlayers; playerNumber++) {
                    int numberFrags = scanInputInt("   Enter the number of frags player"
                            + playerNumber + ": ");
                    totalFrags = totalFrags + numberFrags;
                }

                totalNamesOfTeams[teamNumber - 1] = nameTeam;
                totalPlayersInTeam[teamNumber - 1] = numberPlayers;
                totalTeamFrags[teamNumber - 1] = totalFrags;

            }

            System.out.println();
            for (int i = 0; i < totalTeamFrags.length; i++) {
                if (totalTeamFrags[i] > maxFrag) {
                    maxFrag = totalTeamFrags[i];
                    maxIndexFrag = i;
                }
                System.out.println("Average number of frags of the Team" + (i + 1) + " = "
                        + (float) (totalTeamFrags[i]) / (float) (totalPlayersInTeam[i]));
            }

            System.out.println("Перемогла команда " + totalNamesOfTeams[maxIndexFrag] + " набрала " + maxFrag + " очків");

        } else {
            System.out.println("There are no commands for calculation");
        }

    }

    public static String scanInputString(String nameInputOption) {

        Scanner scan = new Scanner(System.in);
        System.out.print(nameInputOption);
        return scan.nextLine();

    }


    public static int scanInputInt(String nameInputOption) {

        Scanner scan = new Scanner(System.in);
        System.out.print(nameInputOption);
        try {
            int a = scan.nextInt();
            if (a >= 0) {
                return a;
            } else {
                System.out.println("Invalid value entered");
            }

        } catch (Exception e) {
            System.out.println("Invalid value entered");
        }
        return scanInputInt(nameInputOption);

    }


}
