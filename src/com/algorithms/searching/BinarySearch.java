package com.algorithms.searching;

public class BinarySearch {

    // O(logN)
    public static int binarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length-1;
        int mid;

        while (start<=end) {
            mid = (start+end)/2;
            if(arr[mid]==num) {
                return mid;
            }
            else if(arr[mid]>num) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {11,22,44,55,65,81,92};
        System.out.println("Index: " + binarySearch(array, 91));
    }
}
