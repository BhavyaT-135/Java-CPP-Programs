package com.problems;

public class Problem17 {
    public static void main(String[] args) {
        String digits = "23";
        phoneNumberLetter("", digits);
    }
    
    static void phoneNumberLetter(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        
        int digit = up.charAt(0) - '0';// This will convert '2' into 2

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            
            char ch = (char) ('a' + i);

            phoneNumberLetter(p + ch, up.substring(1));
        }
    }
}
