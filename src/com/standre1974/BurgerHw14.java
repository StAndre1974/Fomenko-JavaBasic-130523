package com.standre1974;

public class BurgerHw14 {

    private String burgerName = "Regular burger";
    private int countBuns = 1;
    private int countMeat = 1;
    private int countCheese = 1;
    private int countGreenery = 1;
    private int countMayonnaise = 1;


    public static void showComposition(String burgerName, int countBuns, int countMeat, int countCheese,
                                       int countGreenery, int countMayonnaise) {
        System.out.printf("%s\nComposition:\nBun - %d\nMeat - %d\nCheese - %d\nGreenery - %d\nMayonnaise - %d\n\n",
                burgerName, countBuns, countMeat, countCheese, countGreenery, countMayonnaise);
    }



}
