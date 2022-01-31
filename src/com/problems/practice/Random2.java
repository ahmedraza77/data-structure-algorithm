package com.problems.practice;

import java.util.Stack;

/*
* Count Factorial Trailing zero
* Valid Paranthesis
*
* */

public class Random2 {

    public static int factorialTrailingZeroes(int n) {
        int x=5, zeros=0;
        while(x<=n) {
            zeros += (n/x);
            x = x*5;
        }
        return zeros;
    }

    public static boolean validParanthesis (String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length; i++) {
            char ch = arr[i];
            if(startingBrace(ch)) {
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                else if(!isMatchingBrace(stack.peek(), ch)) {
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isMatchingBrace(Character a, Character b) {
        if(a=='(' && b==')'
                || a=='[' && b==']'
                || a=='{' && b=='}') {
            return true;
        } else {
            return false;
        }
    }

    public static boolean startingBrace(Character c) {
        if(c=='(' || c=='[' || c=='{') {
            return true;
        }
        else {
            return false;
        }
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int mEnd = m-1;
        int nEnd = n-1;
        int last = (m+n)-1;

        while(mEnd>=0 && nEnd>=0) {
            nums1[last--] = nums2[nEnd] >= nums1[mEnd]? nums2[nEnd--]: nums1[mEnd--];
        }

        while(nEnd>=0) {
            nums1[last--] = nums2[nEnd--];
        }
        return nums1;
    }

    public static int strStr(String haystack, String needle) {
        if(needle.length()==0) {
            return 0;
        }
        int firstMatch=-1;
        int p1=0, p2=0;
        while(p1<haystack.length() && p2<needle.length()) {
            if(haystack.charAt(p1)==needle.charAt(p2)) {
                if(p2==0){
                    firstMatch = p1;
                }
                p1++;
                p2++;
            }else {
                if(p2>0){
                    p1=firstMatch+1;
                } else {
                    p1++;
                }
                p2=0;
            }
        }
        return (needle.length()==p2)?firstMatch:-1;
    }

    public static int strStr2(String haystack, String needle) {
        if(haystack.equals(needle) || needle.length()==0) {
            return 0;
        }
        int nLength = needle.length();
        int hLength = haystack.length();
        int p1=0;
        while(p1<=hLength-nLength) {
            if(haystack.charAt(p1)==needle.charAt(0)) {
                String sub = haystack.substring(p1,p1+nLength);
                if(sub.equals(needle)){
                    return p1;
                }
            }
            p1++;
        }
        return -1;
    }


    public static void main(String[] args) {
//        System.out.println(factorialTrailingZeroes(30));
        System.out.println(validParanthesis("()[]{}"));
        int[] arr = {2,0};
        int[] arr2 = {1};
        System.out.println(merge(arr, 1, arr2, 1));
        System.out.println(strStr2("ThisIsALovelyDay", "Lovely"));
    }
}
