package com.recursionStrings;

import java.util.ArrayList;

public class recursionPermutations {
    public static void main(String[] args) {
        String temp = "abc";
        permutations("", temp);
        ArrayList<String> ans = permutations2("", temp);
        System.out.println(ans.toString());
    }
    
    static void permutations(String p, String up) {
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
    
    static ArrayList<String> permutations2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutations2(first + ch + second, up.substring(1)));
        }

        return ans;
    }
}
