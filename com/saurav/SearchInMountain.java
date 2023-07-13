package com.saurav;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,6,8,10,9,7,5,4,3};
        System.out.println(peakIndexMountArray(arr));
    }
    int search(int[] arr, int target){
            int peak = peakIndexMountArray(arr);
            int firstTry = OrderAgnosticbs(arr, target, 0, peak);
            if(firstTry!=-1){
                return firstTry;
            }
            //try to search in second half
      return OrderAgnosticbs(arr, target, peak+1, arr.length -1);

    }
    public static int peakIndexMountArray(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in the descending part of the array
                //this may be the answer but look to the left
                //this is why end != mid-1
                end = mid;

            }else{
                //you are in ascending part of array
                start = mid+1; //because we know that, mid+1 element is greater than mid element
            }
        }
        //in the end, start  == end and pointing to the largest number because of the two check above
        //start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just one element, that is the maximum value, because that is what the checks say
        //more elaboration : at every point of time for start and end, they have the best possible answer till that time.
        //and if we are saying, that only one item is remaining, that is the best possible answer.
        return start;
    }
    public static int OrderAgnosticbs(int[] arr,int target, int start, int end){
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

