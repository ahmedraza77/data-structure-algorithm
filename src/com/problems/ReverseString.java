package com.problems;

public class ReverseString {
    public static void main(String[] args) {
        String sentence = "This is a lovely day";
        reverseString(sentence);
    }

    public static void reverseString(String sentence){
        char[] charArray = sentence.toCharArray();
        for (int i=charArray.length-1; i>=0; i--) {
            System.out.print(charArray[i]);
        }
    }
    //O(n)
    //String Buffer could be used as well instead of char Array, but I suppose space complexity would be more.
}
