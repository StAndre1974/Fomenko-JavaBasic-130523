package com.standre1974;

public class BurgerHw14 {

    private String burgerName = "Regular burger";
    private int countBuns = 1;
    private int countMeat = 1;
    private int countCheese = 1;
    private int countGreenery = 1;
    private int countMayonnaise = 1;

    public BurgerHw14() {
        showComposition(burgerName, countBuns, countMeat, countCheese, countGreenery, countMayonnaise);
    }

    public BurgerHw14(String burgerName) {
        this.burgerName = burgerName;
        this.countMayonnaise = 0;
        showComposition(burgerName, countBuns, countMeat, countCheese, countGreenery, countMayonnaise);
    }

    public BurgerHw14(String burgerName, int countMeat) {
        this.burgerName = burgerName;
        this.countMeat = countMeat;
        showComposition(burgerName, countBuns, countMeat, countCheese, countGreenery, countMayonnaise);
    }


    public static void showComposition(String burgerName, int countBuns, int countMeat, int countCheese,
                                       int countGreenery, int countMayonnaise) {
        System.out.printf("%s\nComposition:\nBun - %d\nMeat - %d\nCheese - %d\nGreenery - %d\nMayonnaise - %d\n\n",
                burgerName, countBuns, countMeat, countCheese, countGreenery, countMayonnaise);
    }



}
