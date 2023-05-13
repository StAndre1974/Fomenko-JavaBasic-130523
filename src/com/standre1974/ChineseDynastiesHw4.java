package com.standre1974;

public class ChineseDynastiesHw4 {
    public static void main(String[] args) {

        int warriorAttackLi = 13;
        int archerAttackLi = 24;
        int riderAttackLi = 46;
        int numberTypeTroopsLi = 860;

        int warriorAttackMin = 9;
        int archerAttackMin = 35;
        int riderAttackMin = 12;

        float ratioTroopsMinToLi = 1.5F;

        int totalAttackLi = totalAttack(warriorAttackLi, archerAttackLi, riderAttackLi, numberTypeTroopsLi);
        System.out.printf("Total attack rate of the Li dynasty: %d%n", totalAttackLi);

        int totalAttackMin = (int) (ratioTroopsMinToLi * totalAttack(warriorAttackMin, archerAttackMin, riderAttackMin,
                numberTypeTroopsLi));
        System.out.printf("Total attack rate of the Min dynasty: %d%n", totalAttackMin);

        int totalAttackLiAndMin = totalAttackLi + totalAttackMin;
        System.out.printf("Total attack rate of the Li and the Min dynasty: %d", totalAttackLiAndMin);


    }

    public static int totalAttack(int warriorAttack, int archerAttack, int riderAttack, int numberTypeTroops) {
        return (warriorAttack + archerAttack + riderAttack) * numberTypeTroops;
    }
}
