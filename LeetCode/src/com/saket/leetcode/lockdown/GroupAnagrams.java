package com.saket.leetcode.lockdown;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs).toString());
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String current : strs){

            char[] charStrs = current.toCharArray();
            Arrays.sort(charStrs);
            String sorted = new String(charStrs);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(current);
        }

        list.addAll(map.values());

        return list;
    }
}
