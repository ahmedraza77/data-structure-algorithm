package com.problems.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4};
        System.out.println(checkDuplicate(arr));
    }

    private static boolean checkDuplicate(int[] nums) {
        Set<Integer> storeNum = new HashSet<>();
        for (int num : nums) {
            boolean b = storeNum.add(num);
            if (!b) {
                return true;
            }
        }
        return false;
    }

}
