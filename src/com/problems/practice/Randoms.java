package com.problems.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
* Fizzbuzz
* Single Number out of duplicates (Binary Search)
* Add two nums without + operator (Bitwise)
* Excel Column Number corresponding Column title
* House Robber
* Count And Say
* */

public class Randoms {
    public static List<String> fizzbuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            else if (nums[mid] == nums[mid - 1]) {
                if (mid % 2 == 1) {
                    left = mid + 1;
                }
                else {
                    right = mid - 2;
                }
            } else {
                if (mid % 2 == 1) {
                    right = mid - 1;
                }
                else {
                    left = mid + 2;
                }
            }
        }
        return nums[left];
    }

    public static int Add(int x, int y)
    {
        while (y != 0)
        {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }

    public static int columnNumber(String columnTitle) {
        int buffer=1;
        int sum=0;
        for(int i=columnTitle.length()-1; i>=0; i--){
            sum+=(columnTitle.charAt(i)-64)*buffer;
            buffer*=26;
        }
        return sum;
    }

    public static int rob(int[] nums) {
        if(nums.length<2) {
            return nums[0];
        }
        int x= nums[0];
        int y= nums[0]>nums[1] ? nums[0] : nums[1];
        int z=y;

        if(nums.length==2) {
            return z;
        }

        for(int i=2; i<nums.length; i++) {
            z = y>x+nums[i]? y:x+nums[i];
            x=y;
            y=z;
        }
        return z;
    }

    public static String countAndSay(int n) {
        if(n==1)
            return "1";
        return countInt(countAndSay(n-1));
    }

    private static String countInt(String str){
        char[] c = str.toCharArray();
        StringBuilder s =  new StringBuilder();
        int count=0;
        for(int i=0;i<c.length-1;i++){
            if(c[i]==c[i+1])
                count++;
            else{
                s.append(count+1).append(c[i]);
                count=0;
            }
        }

        s.append(count+1).append(c[c.length-1]);
        return s.toString();
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] intersection = new int[nums1.length<nums2.length?nums1.length:nums2.length];
        int k=0;

        for(int i=0, j=0; i<nums1.length && j<nums2.length;) {
            if(nums1[i]<nums2[j]) {
                i++;
            }
            else if(nums1[i]>nums2[j]) {
                j++;
            }
            else {
                intersection[k++]=nums1[i];
                i++;
                j++;
            }
        }
        return intersection;
    }

    public static void main(String[] args) {

//        List<String> list = fizzbuzz(3);
//        list.forEach(System.out::print);

        System.out.println(singleNumber(new int[] {2,2,1,1,6,7,6,8,8,7,9}));
        System.out.println(Add(8, 4));

  //      columnNumber("BZ");
  //      System.out.println(rob(new int[] {2,7,9,3,1}));

  //      countAndSay(4);

        intersect(new int[]{1,2,2,1}, new int[]{2,2});

    }
}
