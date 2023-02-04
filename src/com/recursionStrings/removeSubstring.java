package com.recursionStrings;

public class removeSubstring{
    public static void main(String[] args) {
        String temp = "Thisappleisrottenapple";
        System.out.println(removeString("apple", temp));
    }

    static String removeString(String temp, String up) {
        int len = temp.length();
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
        if (up.startsWith(temp)) {
            return removeString(temp, up.substring(len));
        } else {
            return ch + removeString(temp, up.substring(1));
        }
    }
}