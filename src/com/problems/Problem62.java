package com.problems;

public class Problem62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(10, 10));
    }

    static int uniquePaths(int m, int n) {
        double ans = 1;
        if (m == 1 || n == 1) {
            return 1;
        } else {
            if (n > m) {
                for (int i = m + n - 2, j = 1; i > n - 1; i--, j++) {
                    ans = (ans * i) / j;
                }
            } else {
                for (int i = m + n - 2, j = 1; i > m - 1; i--, j++) {
                    ans = (ans * i) / j;
                }
            }
        }
        return (int) (ans);
    }
}
