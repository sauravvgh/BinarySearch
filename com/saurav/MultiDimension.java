package com.saurav;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimension {

    public static void main(String[] args) {
    int arr[][] = new int[3][3];
    Scanner in = new Scanner(System.in);

    for(int i=0; i<arr.length; i++){
        for(int j = 0; j<arr[i].length; j++ ){
            arr[i][j] = in.nextInt();
        }
    }

    for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
