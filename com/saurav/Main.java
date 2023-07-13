package com.saurav;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println( search("Saurav", 'S'));
        String names = "Ugendra";
        System.out.println(Arrays.toString(names.toCharArray()));
    }

    public static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }

      for(char ch: str.toCharArray()){
          if(ch == target){
              return true;
          }
        }
        return false;
    }

    public static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length() ; i++) {
            if(target == str.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
