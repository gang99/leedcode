package org.george.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;

public class ContainerWithMostWaterTest {
    @Test
    public void testMaxArea1() {
        assertEquals(1, ContainerWithMostWater.maxArea(new int[]{2, 1}));
    }
    @Test
    public void testMaxArea2() {
        assertEquals(4, ContainerWithMostWater.maxArea(new int[]{2, 1, 6}));
    }
    @Test
    public void testMaxArea3() {
        assertEquals(4, ContainerWithMostWater.maxArea(new int[]{1, 2, 4, 3}));
    }
    @Test
    public void testMaxArea4() {
        assertEquals(15, ContainerWithMostWater.maxArea(new int[]{1, 2, 1, 6, 4, 5}));
    }
}
