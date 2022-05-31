package bhavya;

import java.util.Scanner;

public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20; 

        {
            a = 70;
            int c = 90;
            System.out.println(a);
        }
        System.out.println(a);
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}