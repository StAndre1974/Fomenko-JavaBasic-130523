package com.standre1974;

public class BurgerHw14 {

    private String burgerName = "Regular burger";
    private String[] ingredients = {"Buns", "Meat", "Cheese", "Greenery", "Mayonnaise"};
    private int[] countIngredients = {1, 1, 1, 1, 1, 1};

    public BurgerHw14() {

        showComposition();
    }

    public BurgerHw14(String burgerName) {
        this.burgerName = burgerName;
        this.countIngredients[4] = 0;
        showComposition();
    }

    public BurgerHw14(String burgerName, int countMeat) {
        this.burgerName = burgerName;
        if ((countMeat < 2) || (countMeat > 10)){
            countMeat = 2;
        }

        this.countIngredients[1] = countMeat;
        showComposition();
    }


    public void showComposition() {
        System.out.print(burgerName + "\nComposition:\n");
        for (int i = 0; i < ingredients.length; i++) {
            if (countIngredients[i] > 0) {
                System.out.printf("%s - %d\n", ingredients[i], countIngredients[i]);
            }
        }
        System.out.print("\n");
    }

}

class BurgerMain {

    public static void main(String[] args) {

        BurgerHw14[] burgers = new BurgerHw14[3];
        burgers[0] = new BurgerHw14();
        burgers[1] = new BurgerHw14("Burger without mayonnaise");
        burgers[2] = new BurgerHw14("Burger double meat", 14);

    }
}


