package com.problems;

import java.util.HashSet;

public class PairWithSum {
    public static void main(String[] args) {
        int[] array1 = {4,8,1,8,3,4};
        int[] array2 = {-4,2,1,12};
        final int sum = 8;

        System.out.println(checkSumPair(array2, sum));
    }

    private static Boolean checkSumPair(int[] array, int sum) {
        HashSet<Integer> arrayComplements = new HashSet<>();
        for (int element : array) {
            if(arrayComplements.contains(element)){
                return true;
            }
            else{
                arrayComplements.add(sum-element);
            }
        }
        return false;
    }
    //O(n)
}
