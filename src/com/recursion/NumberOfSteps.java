package com.recursion;

public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(helper(16, 0));
    }

    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 2 == 0) {
            n /= 2;
            count++;
        } else {
            n -= 1;
            count++;
        }
        return helper(n, count);
    }
}
