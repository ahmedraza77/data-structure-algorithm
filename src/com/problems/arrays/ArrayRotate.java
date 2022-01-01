package com.problems.arrays;

public class ArrayRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        arr = rotate(arr, 3);
        for (int i : arr) {
            System.out.print(i);
        }
    }
    public static int[] rotate(int[] nums, int d) {
        int size = nums.length;
        int[] temp = new int[d];
        int j=0, k=0;

        for(int i=size-1; i>=size-d; i--) {
            temp[j++] = nums[i];
        }

        for(int i=size-1-d; i>=0; i--){
            nums[i+d] = nums[i];
        }

        for(int i=j-1; i>=0; i--) {
            nums[k++] = temp[i];
        }
        return nums;
    }
}
