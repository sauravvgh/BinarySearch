package com.saurav;

public class BinarySearch {
    public static void main(String[] args) {
      int arr[] = {1,2,3,4,5,6,7,8,9}; //this array should be a sorted array ,
      int target = 7;
      System.out.println(binarySearch(arr, target ));

    }

    //return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = arr[mid] + 1;
            } else if (arr[mid] > target) {
                    end = arr[mid] - 1;
                }
            else{
                return mid;
            }
        }
        return -1;
    }
}
