package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndex = new HashMap<>();
        int count = 0;
       for(int num : nums){
           int bal = target - num;
           if(!numIndex.containsKey(num)){
               numIndex.put(bal,Integer.valueOf(count));
           }
           else {
               return new int[]{numIndex.get(num),count};
           }
           count++;
       }
        throw new IllegalArgumentException("No two sum solution");
    }
}
