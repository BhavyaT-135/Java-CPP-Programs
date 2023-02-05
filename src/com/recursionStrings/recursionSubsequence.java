package com.recursionStrings;

import java.util.ArrayList;

public class recursionSubsequence {
    public static void main(String[] args) {
        subsequence("", "abc");
        ArrayList<String> ans = new ArrayList<>();
        ans = subseq("", "abc");
        System.out.println(ans.toString());
        subsequenceAscii("", "abc");

    }

    public static void subsequence(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subsequence(p + ch, up.substring(1));
        subsequence(p, up.substring(1));
    }

    public static ArrayList<String> subseq(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseq(p + ch, up.substring(1));
        ArrayList<String> right = subseq(p, up.substring(1));

        left.addAll(right);
        return left;
    }
    
    public static void subsequenceAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subsequenceAscii(p + ch, up.substring(1));
        subsequenceAscii(p, up.substring(1));
        subsequenceAscii(p + (ch+0), up.substring(1));
    }
}
