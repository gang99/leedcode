package org.george.leetcode;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class IntegerToRomanTest {
    @Test
    public void test1() {
        assertEquals("I", IntegerToRoman.intToRoman(1));
        assertEquals("II", IntegerToRoman.intToRoman(2));
        assertEquals("III", IntegerToRoman.intToRoman(3));
        assertEquals("IV", IntegerToRoman.intToRoman(4));
        assertEquals("V", IntegerToRoman.intToRoman(5));
        assertEquals("VI", IntegerToRoman.intToRoman(6));
        assertEquals("VII", IntegerToRoman.intToRoman(7));
        assertEquals("VIII", IntegerToRoman.intToRoman(8));
        assertEquals("IX", IntegerToRoman.intToRoman(9));
        assertEquals("X", IntegerToRoman.intToRoman(10));
    }

    @Test
    public void test10() {
        assertEquals("XI", IntegerToRoman.intToRoman(11));
        assertEquals("XII", IntegerToRoman.intToRoman(12));
        assertEquals("XIII", IntegerToRoman.intToRoman(13));
        assertEquals("XIV", IntegerToRoman.intToRoman(14));
        assertEquals("XV", IntegerToRoman.intToRoman(15));
        assertEquals("XVI", IntegerToRoman.intToRoman(16));
        assertEquals("XVII", IntegerToRoman.intToRoman(17));
        assertEquals("XVIII", IntegerToRoman.intToRoman(18));
        assertEquals("XIX", IntegerToRoman.intToRoman(19));
        assertEquals("XX", IntegerToRoman.intToRoman(20));
    }

    @Test
    public void test50() {
        assertEquals("XLII", IntegerToRoman.intToRoman(42));
        assertEquals("LVIII", IntegerToRoman.intToRoman(58));
        assertEquals("MCMXCIV", IntegerToRoman.intToRoman(1994));
        assertEquals("CD", IntegerToRoman.intToRoman(400));
    }
}
