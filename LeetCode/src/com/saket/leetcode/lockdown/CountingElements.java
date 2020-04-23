package com.saket.leetcode.lockdown;

import java.util.Arrays;
import java.util.HashSet;

public class CountingElements {

    public static void main(String[] args) {

        int[] arr = new int[]{1,3,2,3,5,0};

        System.out.println(countElements(arr));

    }

    public static int countElements(int[] arr) {

        Arrays.sort(arr);

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }

        int count = 0;

        for(int i=0; i<arr.length-1; i++){
            if(set.contains(arr[i]+1)){
                count++;
            }
        }

        return count;
    }

}
