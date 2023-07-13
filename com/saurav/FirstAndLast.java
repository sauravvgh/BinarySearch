package com.saurav;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
       int[] nums  = {1,2,3,3,3,3,4,5,6,7};
       int [] newSearch =  searchRange(nums, 3);
       System.out.println(Arrays.toString(newSearch));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1,-1};
        //check for the first occurrence of the target
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] =start;
        ans[1] = end;
        return ans;
        }
    //this function just returns the index value of the target.
   public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;
            if(target< nums[mid]){
                end = mid-1;
            }else if(target>nums[mid]){
                start = mid + 1;
            }
            else {
                //potential answer has been found
              ans = mid;
              if(findStartIndex){
                  end = mid-1;
              }else{
                  start = mid+ 1;
              }
            }
        }
        return ans;
    }

}