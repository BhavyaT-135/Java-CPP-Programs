package com.problems;

public class Problem744 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(letters, 'a'));
    }
    
    static char nextGreatestLetter(char[] letters, char target) {
        
        if(target >= letters[letters.length - 1] || target < letters[0]) return letters[0];
        
        int right = letters.length - 1;
        int left = 0;
        
        while(left <= right){ 
            
            int midpoint = left + (right - left)/2;
            
            if(target > letters[midpoint] || target == letters[midpoint]) left = midpoint + 1;
            if(target < letters[midpoint]) right = midpoint - 1;
                
        }
        
        if(target < letters[right]) return letters[right];
        else return letters[right + 1];
    }
}