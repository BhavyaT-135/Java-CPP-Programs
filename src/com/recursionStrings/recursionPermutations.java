package com.recursionStrings;

public class recursionPermutations {
    public static void main(String[] args) {
        String temp = "abc";
        permutations("", temp);
    }
    
    static void permutations(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            permutations(first + ch + second, up.substring(1));
        }
    }
}
