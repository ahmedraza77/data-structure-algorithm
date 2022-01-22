package com.problems.arrays;

public class TrappingRainwater {

    //brute force => O(n2)
    public static int findMaxWater(int[] heights) {
        int sum=0;

        for(int i=0; i<heights.length; i++) {
            int l = i, r=i;
            int maxLeft = 0;
            int maxRight = 0;
            while (l>=0) {
                if(heights[l]>maxLeft) {
                    maxLeft = heights[l];
                }
                l--;
            }
            while(r<heights.length) {
                if(heights[r]>maxRight) {
                    maxRight = heights[r];
                }
                r++;
            }
            int currentWater = Math.min(maxLeft, maxRight) - heights[i];
            if(currentWater>0) {
                sum += currentWater;
            }
        }
        return sum;
    }

    // Optimized 2 pointer => O(n)
    public static int findMaxRainWater(int[] heights) {
        int totalWater =0;
        int p1 = 0, p2 = heights.length-1;
        int leftMax=0, rightMax=0;

        while (p1<p2) {
            if(heights[p1]<=heights[p2]) {
                if(heights[p1]>=leftMax) {
                    leftMax = heights[p1];
                } else {
                    int current = leftMax - heights[p1];
                    totalWater += current;
                }
                p1++;
            } else {
                if(heights[p2]>=rightMax) {
                    rightMax = heights[p2];
                } else {
                    int current = rightMax - heights[p2];
                    totalWater += current;
                }
                p2--;
            }
        }
        return totalWater;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int res = findMaxWater(arr);
        int sol = findMaxRainWater(arr);
        System.out.println(res);
        System.out.println(sol);
    }
}
