package org.george.leetcode;

import java.util.*;


public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int lo = i + 1, hi = nums.length - 1, remains = 0 - nums[i];
                while (lo < hi && remains >= 0) {
                    int sum = nums[lo] + nums[hi];
                    if (sum == remains) {
                        result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                        lo++;
                        hi--;
                    } else if (sum < remains) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }
        return result;
    }
}
