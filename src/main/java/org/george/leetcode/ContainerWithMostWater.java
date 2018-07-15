package org.george.leetcode;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max = 0;
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        int leftHeight = 0;
        for(int i=0;i<height.length;i++) {
            left[i] = leftHeight;
            if(left[i] > leftHeight) {
                leftHeight = left[i];
            }
        }
        int rightHeight = 0;
        for(int i=height.length-1;i>-1;i--) {
            right[i] = rightHeight;
            if(right[i] > rightHeight) {
                rightHeight = right[i];
            }
        }
        for(int i=1;i<height.length-1;i++) {
            max = max + Math.abs(Math.min(left[i], right[i]) - height[i]);
        }
        return max;
    }
}
