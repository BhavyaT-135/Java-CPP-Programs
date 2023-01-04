package com.problems;

public class Problem365 {
    public static void main(String[] args) {
        System.out.println(canMeasureWater(1, 1, 12));
    }
    
    public static boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        boolean ans = false;
        int hcf = hcf(jug1Capacity, jug2Capacity);
        System.out.println(hcf);
        if ((jug1Capacity + jug2Capacity) < targetCapacity) {
            return false;
        }
        if (((targetCapacity - jug1Capacity) % hcf == 0) && ((targetCapacity - jug1Capacity) >= 0)) {
            ans = true;
        }

        if (((targetCapacity - jug2Capacity) % hcf == 0) && ((targetCapacity - jug2Capacity) >= 0)) {
            ans = true;
        }

        if ((targetCapacity - jug2Capacity) < 0 && (targetCapacity - jug1Capacity) < 0) {
            if (targetCapacity % hcf == 0) {
                ans = true;
            }
        }

        return ans;
    }

    static int hcf(int a, int b) {
        int small = a >= b ? b : a;
        int ans = 1;
        for (int i = 1; i <= small; i++) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }
        return ans;
    }
}
