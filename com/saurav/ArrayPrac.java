package com.saurav;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Digits = new int[5];
        //input the number of elements using for loop
        System.out.println("Input 5 digits: ");
        for (int i = 0; i < Digits.length ; i++) {
            Digits[i] = sc.nextInt();
        }
//        System.out.println(Arrays.toString(Digits));

        String[] str = new String[4];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some strings");
        for (int i = 0; i <str.length ; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
