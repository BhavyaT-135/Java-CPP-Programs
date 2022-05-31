package bhavya;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int num1 = 43;
        int num2 = 26;
        swap(num1, num2);

        System.out.println("After swapping, num1 is " + num1 + " and num2 is " + num2);
    }

    static void swap(int a, int b) {
            int temp = a;
            a = b;
            b = temp;
        }
}