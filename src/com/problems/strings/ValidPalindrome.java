package com.problems.strings;

public class ValidPalindrome {

    public static boolean checkPalindromeMethod1(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (int i=str.length()-1; i>=0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString().equals(str);
    }

    public static boolean checkPalindromeMethod2(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0;
        int right = str.length()-1;
        while (left<right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean checkPalindromeMethod3(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left, right;
        if(str.length()%2==0) {
            left = (str.length()/2)-1;
            right = str.length()/2;
        } else {
            left = right = str.length()/2;
        }

        while (left>=0 && right<str.length()) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left--;
            right++;
        }
        return true;
    }

    //Still Palindrome after removing one character
    public static boolean almostPalindrome(String s) {
        int left = 0, right = s.length()-1;

        while (left<right) {
            if(s.charAt(left) != s.charAt(right)) {
                boolean l = checkPalindromeAfterRemove(s, left+1, right);
                if(!l) {
                    return checkPalindromeAfterRemove(s, left, right-1);
                } else {
                    break;
                }
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean checkPalindromeAfterRemove(String s, int l, int r) {
        while(l<r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";

        System.out.println(checkPalindromeMethod1(str));
        System.out.println(checkPalindromeMethod2(str));
        System.out.println(checkPalindromeMethod3(str));

        System.out.println(almostPalindrome("deee"));
    }
}
