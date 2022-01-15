package com.problems.practice;

/*
* Roman Value to Decimal
* Anagram
* Is Happy Number
* Pascal Triangle
* */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Random1 {

    public static int getValue(char romanCharacter) {
        int value = 0;
        switch(romanCharacter) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
        }
        return value;
    }

    public static int romanToInt(String s) {
        if(s.length()<2) {
            return getValue(s.charAt(0));
        }

        int sum=0;
        char current;
        Character next = null;

        for(int i=0; i<s.length(); i++){
            current = s.charAt(i);
            if(i+1<s.length()) {
                next = s.charAt(i+1);
            }
            if(next!=null && getValue(current)<getValue(next)) {
                sum -= getValue(current);
            }
            else {
                sum += getValue(current);
            }
        }
        return sum;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] hash = new int[26];
        for(char c : t.toCharArray()){
            ++hash[c - 'a'];
        }
        for(char c : s.toCharArray()){
            --hash[c - 'a'];
            if(hash[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(n!=1) {
            int sum = squareRoot(n);
            if(sum==1) {
                return true;
            }
            if(!set.add(sum)) {
                return false;
            }
            n=sum;
        }
        return false;
    }

    public static int squareRoot(int number) {
        int ans = 0;
        while(number > 0) {
            int remainder = number % 10;
            ans += remainder * remainder;
            number /= 10;
        }
        return ans;
    }

    public static List<List<Integer>> pascalTriangle(int numRows) {

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i)
                    list.get(i).add(1);
                else {
                    int temp = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
                    list.get(i).add(temp);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
      System.out.println(romanToInt("MCMIV"));
//        System.out.println(isAnagram("anagram", "nagaram"));
//        System.out.println(isHappy(19));

//        System.out.println(pascalTriangle(5));
    }
}
