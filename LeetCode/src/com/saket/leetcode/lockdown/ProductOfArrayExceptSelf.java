package com.saket.leetcode.lockdown;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4};

        int[] res = productExceptSelf(nums);

        for(int i : res){
            System.out.print(i + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {

        int len = nums.length;

        int[] left = new int[len];
        int[] right = new  int[len];

        left[0] = nums[0];
        right[len-1] = nums[len-1];

        for(int i=1; i<len; i++){
            left[i] = left[i-1]*nums[i];
        }

        for(int i=len-2; i>=0; i--){
            right[i] = right[i+1]*nums[i];
        }

        int[] output = new int[len];

        output[0] = right[1];
        output[len-1] = left[len-2];

        for(int i=1; i<len-1; i++){
            output[i] = left[i-1]*right[i+1];
        }

        return output;
    }
}
