package com.saket.leetcode.lockdown;

import java.util.HashSet;

public class HappyNumber {

    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while(n != 1){

            int current = n;
            int sum = 0;

            while(current != 0){
                sum += (current%10) * (current%10);
                current /= 10;
            }

            if(set.contains(sum))
                return false;

            set.add(sum);
            n = sum;
        }

        return true;

    }
}
