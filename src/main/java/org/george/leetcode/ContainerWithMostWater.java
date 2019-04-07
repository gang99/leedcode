package org.george.leetcode;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            int leftHeight = height[i];
            for (int j = height.length - 1; j > i; j--) {
                if (height[j] < leftHeight) {
                    max = Math.max(max, height[j] * (j - i));
                } else {
                    max = Math.max(max, leftHeight * (j - i));
                    break;
                }
            }
        }
        return max;
    }
}
