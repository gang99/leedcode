package org.george.leetcode;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ZigZagConversionTest {
    @Test
    public void testConversion() {
        assertEquals("A",ZigZagConversion.convert("A", 1));
        assertEquals("A",ZigZagConversion.convert("A", 2));
        assertEquals("ACB",ZigZagConversion.convert("ABC", 2));
        assertEquals("PAHNAPLSIIGYIR",ZigZagConversion.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", ZigZagConversion.convert("PAYPALISHIRING", 4));
    }
}
