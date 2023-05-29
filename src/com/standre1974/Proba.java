package com.standre1974;

import java.util.*;

public class Proba {



    public static void main(String[] args) {

        Burger[]array = new Burger[3];
        array[0] = new Burger();
        array[1] = new Burger();
        array[2] = new Burger();
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }



    }


}

class Burger {

    private String burgerName = "Regular burger";
    private int countBuns = 1;
    private int countMeat = 1;
    private int countCheese = 1;
    private int countGreenery = 1;
    private int countMayonnaise = 1;

    public Burger() {
        showComposition(burgerName, countBuns, countMeat, countCheese, countGreenery, countMayonnaise);
    }

    public static void showComposition(String burgerName, int countBuns, int countMeat, int countCheese,
                                       int countGreenery, int countMayonnaise) {
        System.out.printf("%s\nComposition:\nBun - %d\nMeat - %d\nCheese - %d\nGreenery - %d\nMayonnaise - %d\n\n",
                burgerName, countBuns, countMeat, countCheese, countGreenery, countMayonnaise);
    }
}

