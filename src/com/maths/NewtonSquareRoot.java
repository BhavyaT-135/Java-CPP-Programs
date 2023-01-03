package com.maths;

public class NewtonSquareRoot {
    public static void main(String[] args) {
        double num = 40;
        System.out.println(sqrt(num));
    }

    static double sqrt(double n){
        double x = n;
        double root;

        while (true) {
            root = 0.5 * (x + (n / x));

            if (Math.abs(root - x) < 0.1) {
                break;
            }

            x = root;
        }
        return root;
    }
}
