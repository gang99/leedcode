package org.george.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class ThreeSumClosestTest {
    @Test
    public void test21() {
        assertEquals(2, ThreeSumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}
