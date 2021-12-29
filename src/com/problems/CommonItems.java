package com.problems;

import java.util.HashMap;
import java.util.Map;

public class CommonItems {
    public static void main(String[] args) {
        int[] arr1 = {'a', 'x', 'f', 's'};
        int[] arr2 = {'c', 'v', 'b'};

        System.out.println(findCommonItems(arr1, arr2));
    }

    private static Boolean findCommonItems(int[] firstArray, int[] secondArray) {
        Map<Integer, Boolean> firstArrayValues = new HashMap<>();
        for (int element : firstArray) {
            firstArrayValues.put(element, Boolean.TRUE);
        }

        for (int element : secondArray) {
            if(firstArrayValues.containsKey(element)){
                return true;
            }
        }
        return false;
    }
    // O(n+m) => O(n)
}
