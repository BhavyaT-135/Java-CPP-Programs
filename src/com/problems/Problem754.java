package com.problems;

public class Problem754 {
    public static void main(String[] args) {
       System.out.println(reachNumber(3)); 
    }

    static int reachNumber(int target) {
        int sum = 0, steps = 0;
        target = Math.abs(target);
        while(sum < target){
            sum+=steps;
            steps ++;
        }
        
        while((sum - target) % 2 == 1){
            sum += steps;
            steps ++;
        }
        return steps-1;
    }
}
