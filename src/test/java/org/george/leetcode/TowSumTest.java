package org.george.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TowSumTest {
    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1}, TowSum.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 2}, TowSum.twoSum(new int[]{3, 2, 4}, 6));
    }
}
