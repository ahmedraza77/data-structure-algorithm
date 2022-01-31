package com.problems.practice;

public class Demo {
    public static void rotate(int[] nums, int k) {

        int[] copy = new int[nums.length];
        for (int i=0; i<copy.length; i++)
            copy[i] = nums[i];

        for (int i=0; i<nums.length; i++)
        {
            nums[(i+k)%nums.length] = copy[i];
        }
    }

    public static int reverse(int x) {
        if(x ==0)
            return 0;

        int rev=0;
        int first =0;

        while (x != 0) {
            first =x;
            int rem = x % 10;
            x = x /10;
            rev = rev*10 + rem;
        }

        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;

        if(rev %10 != first)
            return 0;

        return rev;
    }

    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
        reverse(585);
        String s;

    }
}
