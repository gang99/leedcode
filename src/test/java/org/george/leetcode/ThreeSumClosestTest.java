package org.george.leetcode;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ThreeSumClosestTest {
    @Test
    public void test() {
        assertEquals(2, ThreeSumClosest.threeSumClosest(new int[]{-1, 2, 1, -4, 7}, 1));
        assertEquals(-3, ThreeSumClosest.threeSumClosest(new int[]{-1, 2, 1, -4, 2}, -2));
    }

    @Test
    public void test1() {
        assertEquals(0, ThreeSumClosest.threeSumClosest(new int[]{0, 2, 1, -3}, 1));
    }

    @Test
    public void test2() {
        assertEquals(82, ThreeSumClosest.threeSumClosest(new int[]{1, 2, 4, 8, 16, 32, 64, 128}, 82));
    }
}
