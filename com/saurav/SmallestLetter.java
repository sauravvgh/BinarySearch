package com.saurav;

public class SmallestLetter {
    public static void main(String[] args) {

    }
    public char nextGreatestLetter(char[] letters, char target) {
        //but what if the target is greater than the greatest number in the array??
        int start = 0;
        int end = letters.length - 1;
        //find whether the array is sorted in ascending or descending order.

        while (start<=end) {
            int mid = start + (end-start)/2;

             if(target<letters[mid]){
                 end = mid-1;
             }else{
                 start = mid +1;

             }
        }
        return letters[start % letters.length]; //returns the ceiling value
    }

}
