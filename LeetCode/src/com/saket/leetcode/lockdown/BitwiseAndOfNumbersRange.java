package com.saket.leetcode.lockdown;

public class BitwiseAndOfNumbersRange {

    public static void main(String[] args) {

        int m = 999;
        int n = 9999;

        System.out.println(m & n);

        System.out.println(rangeBitwiseAnd(m, n));

    }

    public static int rangeBitwiseAnd(int m, int n) {

        int count = 0;

        while (m != n){
             m >>= 1;
             n >>= 1;
             count += 1;
        }

        int result = (m <<= count);

        return result;

    }

}
