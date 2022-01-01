package com.problems.arrays;

public class MaximumSubArray {
    public static void main(String[] args) {

        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is "
                + maxSubArraySum(a));
    }

    private static int maxSubArraySum(int[] a) {
        int max = a[0];
        int curr_max = a[0];

        for (int i = 1; i < a.length; i++) {
            curr_max = (a[i] < (curr_max + a[i])) ? (curr_max + a[i]) : a[i];
            max = (curr_max > max) ? curr_max : max;
        }
        return max;
    }
}

