package org.george.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class CustomSortStringTest {
    @Test
    public void testCustomSortString() {
        Assert.assertEquals("abcd", CustomSortString.customSortString(null, "abcd"));
        Assert.assertEquals("abcd", CustomSortString.customSortString("", "abcd"));
        Assert.assertEquals("cbad", CustomSortString.customSortString("cba", "abcd"));
        Assert.assertEquals("ccbbaadf", CustomSortString.customSortString("cba", "abcdafcb"));
    }
}
