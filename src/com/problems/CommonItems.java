package com.problems;

import java.util.HashSet;
import java.util.Set;

public class CommonItems {
    public static void main(String[] args) {
        int[] arr1 = {'a', 'x', 'c', 's'};
        int[] arr2 = {'c', 'v', 'b'};

        System.out.println(findCommonItems(arr1, arr2));
    }

    private static Boolean findCommonItems(int[] firstArray, int[] secondArray) {
        Set<Integer> firstArrayValues = new HashSet<>();
        for (int element : firstArray) {
            firstArrayValues.add(element);
        }

        for (int element : secondArray) {
            if(firstArrayValues.contains(element)){
                return true;
            }
        }
        return false;
    }
    // O(n+m) => O(n)
}
