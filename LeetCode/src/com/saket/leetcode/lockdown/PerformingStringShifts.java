package com.saket.leetcode.lockdown;

public class PerformingStringShifts {

    public static void main(String[] args) {

        String s = "joiazl";
        int[][] shift = new int[][]{{1,1},{1,6},{0,1},{1,3},{1,0},{0,3}};

        System.out.println(stringShift(s, shift));
    }

    public static String stringShift(String s, int[][] shift) {

        int effRot = 0;

        for(int i=0; i<shift.length; i++){
            effRot += shift[i][0]== 0 ? -shift[i][1] : shift[i][1];
        }

        effRot %= s.length();

        String result = "";

        if(effRot > 0){
            result = s.substring(s.length()-effRot, s.length()) + s.substring(0, s.length()-effRot);
        }else{
            result = s.substring(-effRot, s.length()+effRot) + s.substring(0, -effRot);
        }

        return result;
    }
}
