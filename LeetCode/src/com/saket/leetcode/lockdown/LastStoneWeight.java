package com.saket.leetcode.lockdown;

import java.util.PriorityQueue;

public class LastStoneWeight {

    public static void main(String[] args) {

        int[] stones = new int[]{2, 7, 4, 1, 8, 1};

        System.out.println(getLastStoneWeight(stones));
    }

    public static int getLastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        for (int stone : stones) {
            maxHeap.add(-stone);
        }

        while (maxHeap.size() > 1) {
            int stone1 = -maxHeap.remove();
            int stone2 = -maxHeap.remove();

            if (stone1 != stone2) {
                maxHeap.add(-(stone1 - stone2));
            }
        }

        return maxHeap.size() == 0 ? 0 : -maxHeap.remove();
    }

}
