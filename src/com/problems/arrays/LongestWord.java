package com.problems.arrays;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "This is an amazingly lovely day";
        String longestWord = longestWord(sentence);
        System.out.println("Longest word is: " + longestWord +
                ", with length : " + longestWord.length());
    }

    public static String longestWord(String sen) {
        String[] words = sen.split("\\s+");
        int max = 0;
        String longest = "";
        for (String word : words) {
            if (word.length() > max) {
                max = word.length();
                longest = word;
            }
        }
        return longest;
    }
}
