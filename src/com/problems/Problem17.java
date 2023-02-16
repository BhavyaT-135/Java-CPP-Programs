package com.problems;

import java.util.ArrayList;

public class Problem17 {
    public static void main(String[] args) {
        String digits = "23";
        phoneNumberLetter("", digits);
        ArrayList<String> ans = phoneNumberLetter2("", digits);
        System.out.println(ans.toString());
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
    
    static ArrayList<String> phoneNumberLetter2(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';// This will convert '2' into 2

        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);

            ans.addAll(phoneNumberLetter2(p + ch, up.substring(1)));
        }

        return ans;
    }
}
