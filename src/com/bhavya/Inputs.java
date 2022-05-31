package bhavya;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your roll number");
        int rollno = input.nextInt();
        System.out.println("Roll no is " + rollno);

        int a = 127;
        byte b = (byte)(a);

        System.out.println(b);
    }
}