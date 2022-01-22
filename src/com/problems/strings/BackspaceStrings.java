package com.problems.strings;

public class BackspaceStrings {
    public static void main(String[] args) {
        System.out.println(backspaceCompareBruteForce("ab#c", "ad#c"));
    }

    public static boolean backspaceCompareBruteForce(String s, String t) {
       return getBackspaceString(s).equals(getBackspaceString(t));
    }

    public static String getBackspaceString(String str) {
        StringBuilder sb = new StringBuilder();
        int skip = 0;
        for (int i=str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            if(ch == '#') {
                skip++;
            }
            else {
                if(skip>0) {
                    skip--;
                }
                else {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
