package com.saurav;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {3,4,5,12};
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void change(int[] arr){
        arr[0]=99;

    }

}
