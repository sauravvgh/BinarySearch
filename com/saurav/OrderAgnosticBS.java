package com.saurav;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] Array = {1,3,5,7,9,11,13};
        int target = 11;
        System.out.println(OrderAgnosticbs(Array, target));
    }
   public static int OrderAgnosticbs(int[] arr, int target){
       int start = 0;
       int end = arr.length - 1;
       //find whether the array is sorted in ascending or descending order.
       boolean isAsc = arr[start]<arr[end];
       boolean isDesc = arr[start]>arr[end];
       while (start<=end) {
           //find the middle element
           int mid = start + (end - start) / 2;
           if(arr[mid]==target){
               return mid;
           }
           if(isAsc){
               if (target>arr[mid]) {
                   start = mid+1;
               } else if (target<arr[mid]) {
                   end = mid-1;
               }
           }
           if(isDesc){
               if(target>arr[mid]){
                   end = mid -1;
               }else{
                   start = mid + 1;
               }
           }
       }
       return -1;
    }
}



