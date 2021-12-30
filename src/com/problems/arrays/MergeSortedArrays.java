package com.problems.arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int [] firstArray = {1,3,6,6,8,9};
        int[] secondArray = {2,5,7,8,9};
        int[] sorted = getSortedArray(firstArray, secondArray);
        int[] alternateSorted = getSortedArray2(firstArray, secondArray, firstArray.length, secondArray.length);

        for (int i : alternateSorted) {
            System.out.print(i);
        }
    }

    private static int[] getSortedArray(int[] firstArray, int[] secondArray) {
        int i = 0;
        int j = 0;
        int[] mergedArray = new int[firstArray.length + secondArray.length];

        if(firstArray.length==0){
            return secondArray;
        }
        if (secondArray.length==0){
            return  firstArray;
        }

        for(int k=0; k<mergedArray.length; k++){
            if(i!= firstArray.length && j!= secondArray.length) {
                if(firstArray[i]<=secondArray[j]){
                    mergedArray[k]=firstArray[i];
                    i++;
                }
                else {
                    mergedArray[k]=secondArray[j];
                    j++;
                }
            }
            else {
                if(i== firstArray.length){
                    mergedArray[k]=secondArray[j];
                    j++;
                }
                else {
                    mergedArray[k]=firstArray[i];
                    i++;
                }
            }
        }
        return mergedArray;
    }
    //Method1 = O(n+m) => O(N)


    //Method2 = O(N)
    private static int[] getSortedArray2(int[] firstArray, int[] secondArray, int length1, int length2) {
        if(length1==0){
            return secondArray;
        }
        if (length2==0){
            return  firstArray;
        }

        int i=0, j=0, k=0;
        int[] mergedArray = new int[length1+length2];

        while(i<length1 && j<length2) {
            if(firstArray[i]<=secondArray[j]) {
                mergedArray[k++] = firstArray[i++];
            }
            else {
                mergedArray[k++] = secondArray[j++];
            }
        }

        while (i<length1) {
            mergedArray[k++] = firstArray[i++];
        }

        while (j<length2) {
            mergedArray[k++] = secondArray[j++];
        }

        return mergedArray;
    }

}
