package com.problems.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    // O(n2)
    public static int longestSubstringBruteForce(String str) {
        int longest = 0;
        for(int i=0; i<str.length(); i++) {
            Set<Character> set = new HashSet<>();
            int currentLongest =0;
            for(int j=i; j<str.length(); j++) {
                if(!set.contains(str.charAt(j))) {
                    set.add(str.charAt(j));
                    currentLongest++;
                    longest = currentLongest>longest ? currentLongest:longest;
                }
                else {
                    break;
                }
            }
        }
        return longest;
    }

    //Shifting Pointers => O(N)
    public static int longestSubstringOptimized(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int left=0;
        int longest = 0;
        for(int right=0; right<str.length(); right++) {
            char ch = str.charAt(right);
            if(map.containsKey(ch)) {
                int prev = map.get(ch);
                if(prev>=left) {
                    left = map.get(ch)+1;
                }
            }
            map.put(ch, right);
            longest = longest > (right-left)+1 ? longest: (right-left)+1;
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstringBruteForce("aab"));
        System.out.println(longestSubstringOptimized("aab"));

    }
}
