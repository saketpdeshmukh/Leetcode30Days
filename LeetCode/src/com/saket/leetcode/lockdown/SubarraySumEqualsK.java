package com.saket.leetcode.lockdown;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public static void main(String[] args) {

        int[] nums = new int[]{1,1,1};
        int k = 2;

        System.out.println(subarraySum(nums, k));

    }

    public static int subarraySum(int[] nums, int k) {

        if(nums.length == 0)
            return 0;

        int count = 0;
        int currSum = 0;

        HashMap<Integer, Integer> sumMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            currSum += nums[i];

            if(currSum == k)
                count += 1;

            if(sumMap.containsKey(currSum - k)){
                count += sumMap.get(currSum - k);
            }

            if(sumMap.containsKey(currSum)){
                sumMap.put(currSum, sumMap.get(currSum)+1);
            }else{
                sumMap.put(currSum, 1);
            }

        }
        return count;
    }
}
