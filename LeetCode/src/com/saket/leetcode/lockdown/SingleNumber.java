package com.saket.leetcode.lockdown;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static void main(String[] args) {

        int[] nums = new int[]{2,2,1};

        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i])+1);
            else
                map.put(nums[i], 1);
        }

        int unique = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1)
                unique = entry.getKey();
        }

        return unique;
    }
}
