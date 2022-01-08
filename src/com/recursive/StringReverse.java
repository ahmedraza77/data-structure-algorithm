package com.recursive;

public class StringReverse {
    public static void reverseString(String string) {
        if(string.length()<=1) {
            System.out.print(string);
        }
        else {
            System.out.print(string.charAt(string.length()-1));
            reverseString(string.substring(0,string.length()-1));
        }
    }

    public static void main(String[] args) {
        reverseString("Ahmed");
    }
}
