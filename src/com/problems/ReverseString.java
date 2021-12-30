package com.problems;

public class ReverseString {
    public static void main(String[] args) {
        String sentence = "This is a lovely day";
        System.out.println(reverseString(sentence));
    }

    public static String reverseString(String sentence){
        StringBuilder reversedString = new StringBuilder();
        for(int i=sentence.length()-1; i>=0; i--) {
            reversedString.append(sentence.charAt(i));
        }
        return reversedString.toString();
    }
}
