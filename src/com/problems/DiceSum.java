package com.problems;

public class DiceSum {
    public static void main(String[] args) {
        int num = 4;
        diceSum("", num);
    }
    
    static void diceSum(String p, int up) {
        if (up == 0) {
            System.out.println(p);
            return;
        }

        for(int i=1; i<=6 && i<=up; i++){
            diceSum(p+i, up-i);
        }
    }
}
