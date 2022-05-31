package  com.bhavya;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        // int digits = 0;
        // int temp = n;
        // while(temp>0) {
        //     temp =temp/10;
        //     digits++;
        // }
        int rev = 0;
    
        while(n>0) {
            int rem = n%10;
            rev = rev*10 + rem;
            n =n/10;
        }
        // while(n>0) {
        //     int rem = n%10;
        //     rev = rev + (rem*(int)Math.pow(10,digits-1));
        //     n =n/10;
        //     digits--;
        // }
        System.out.println(rev);
    }
}