package org.george.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class ThreeSumTest {
    @Test
    public void test1() {
        List<Integer> one = Arrays.asList(-1, 0, 1);
        List<Integer> two = Arrays.asList(-1, -1, 2);
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(two);
        expect.add(one);
        assertEquals(expect, ThreeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    @Test
    public void test2() {
        List<Integer> one = Arrays.asList(0, 0, 0);
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(one);
        assertEquals(expect, ThreeSum.threeSum(new int[]{0, 0, 0}));
    }

}
