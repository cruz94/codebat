package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndex = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int bal =  target - nums[i];
            if(numIndex.containsKey(bal)){
                return new int[] {numIndex.get(bal), i};
            }
            numIndex.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
