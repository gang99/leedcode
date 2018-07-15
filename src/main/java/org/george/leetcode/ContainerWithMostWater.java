package org.george.leetcode;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max = 0;
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        int leftHeight = 0;
        for(int i=0;i<height.length;i++) {
            left[i] = leftHeight;
            if(height[i] > leftHeight) {
                leftHeight = height[i];
            }
        }
        int rightHeight = height[height.length-1];
        for(int i=height.length-1;i>-1;i--) {
            right[i] = rightHeight;
            if(height[i] > rightHeight) {
                rightHeight = height[i];
            }
        }
        for(int i=0;i<height.length;i++) {
            System.out.println(left[i] + ", " + height[i] + ", " + right[i]);
        }
        for(int i=1;i<height.length;i++) {
            max = max + Math.min(left[i], right[i]);
        }
        return max;
    }
}
