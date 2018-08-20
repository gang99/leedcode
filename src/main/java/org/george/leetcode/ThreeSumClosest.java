package org.george.leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int result = 10000;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-2; i++) {
                int lo = i + 1, hi = nums.length - 1;
                while (lo < hi) {
                    int sum = nums[i] + nums[lo] + nums[hi];
                    System.out.println(nums[i] + "," + nums[lo] + "," + nums[hi]);
                    if(Math.abs(sum-target) < Math.abs(result-target)) {
                        result = sum;
//                    } else {
//                        break;
                    }
                    System.out.println("result=" + result);
                    if (sum > target) {
                        hi--;
                    } else if (sum < target) {
                        lo++;
                    } else {
                        return result;
                    }
                }
        }
        return result;
    }
}
