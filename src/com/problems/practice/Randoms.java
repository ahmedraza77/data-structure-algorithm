package com.problems.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
* Fizzbuzz
* Single Number out of duplicates (Binary Search)
* Add two nums without + operator (Bitwise)
* Excel Column Number corresponding Column title
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

    static int Add(int x, int y)
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


    public static void main(String[] args) {

//        List<String> list = fizzbuzz(3);
//        list.forEach(System.out::print);

  //      System.out.println(singleNumber(new int[] {2,2,1,6,7,6,8,8,7}));
  //      System.out.println(Add(4, 8));

        columnNumber("BZ");

    }
}
