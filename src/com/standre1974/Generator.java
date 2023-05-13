package com.standre1974;

import java.util.Random;

public class Generator {
    public static void main(String[] args) {

        int minValue = 3;
        int maxValue = 12;

        Random random = new Random();
        for(int i = 1; i < 20; i++) {
            System.out.println(generationRandomNumber(random,minValue, maxValue));
        }
    }

    public static int generationRandomNumber(Random random, int minValue, int maxValue) {
        return random.nextInt(maxValue-minValue + 1) + minValue;
    }


}
