package com.algorithms.sorting;

public class MergeSort {
    public static int[] mergeSort(int[] arr) {

        int start = 0;
        int end = arr.length;
        split(arr, start, end);
        return arr;
    }

    // Time -> O(nlogn)
    public static void split(int[] arr, int start, int end) {
        if(end-start<2) {
            return;
        }
        int mid = (start + end)/2;
        split(arr, start, mid);
        split(arr, mid, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        if(arr[mid-1]<=arr[mid]) {
            return;
        }
        int[] temp = new int[end-start];
        int tempIndex = 0;
        int i = start;
        int j = mid;

        while(i<mid && j<end) {
            temp[tempIndex++] = arr[i]<=arr[j] ? arr[i++] : arr[j++];
        }
        while (i<mid){
            temp[tempIndex++] = arr[i++];
        }
        while (j<end){
            temp[tempIndex++] = arr[j++];
        }

        //Copy temp array to main array
        System.arraycopy(temp, 0, arr, start, tempIndex);
    }

    public static void main(String[] args) {
        int[] array = {8,2,6,7,1,9,4,5};
        for (int i : mergeSort(array)) {
            System.out.print(i);
        }
    }
}
