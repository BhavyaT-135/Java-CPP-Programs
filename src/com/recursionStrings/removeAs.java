package com.recursionStrings;

public class removeAs {
    public static void main(String[] args) {
        String name = "Bhavya Tewari";
        removeA("", name);
        System.out.println(removeA_2(name));
    }
    
    static void removeA(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            removeA(p, up.substring(1));
        } else {
            removeA(p + ch, up.substring(1));
        }
    }
    
    static String removeA_2(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            return removeA_2(up.substring(1));
        } else {
            return ch + removeA_2(up.substring(1));
        }
    }
}
