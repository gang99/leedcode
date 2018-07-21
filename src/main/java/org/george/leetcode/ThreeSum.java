package org.george.leetcode;

import java.util.*;


public class ThreeSum {
    public static List<List<Integer>> threeSum(Integer[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums, Comparator.naturalOrder());
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                int next = nums.length - 1;
                if(nums[i] + nums[next] > 0) {
                    int nextTwo = i + 1;
                    int sum = nums[i] + nums[next] + nums[nextTwo];
                    if(sum == 0) {
                        List<Integer> one = new ArrayList<>();
                        one.add(nums[i]);
                        one.add(nums[next]);
                        one.add(nums[nextTwo]);
                    } if(sum > 0) {
                        next--;
                    } else {

                    }
                } else {

                }
            } else {
                break;
            }
        }
        return result;
    }
}
