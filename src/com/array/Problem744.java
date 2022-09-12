package com.array;

public class Problem744 {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'j';
        System.out.println(nextGreatestLetter(letters, target));
    }

    static public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (target >= letters[end]) {
            return letters[0];
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (start == target) {
            return letters[start + 1];
        } else if (start > target) {
            return letters[start];
        }
        return letters[start];
    }
}
