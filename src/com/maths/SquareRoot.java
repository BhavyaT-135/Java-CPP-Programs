package com.maths;

public class SquareRoot {
    public static void main(String[] args) {
        int num = 1024;
        System.out.println(squareRoot(num));
    }
    
    static int squareRoot(int n) {
        int ans = 0;
        if (n == 0) {
            return 0;
        }
        if (n < 4) {
            return 1;
        }
        for (int i = 1; i <= n / 2; i++) {
            if (n / i <= i) {
                ans = i;
                break;
            }
        }
        if (ans * ans <= n) {
            return ans;
        }
        else {
            return ans - 1;
        }
    }
}
