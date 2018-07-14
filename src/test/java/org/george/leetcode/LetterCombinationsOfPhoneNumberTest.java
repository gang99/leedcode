package org.george.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class LetterCombinationsOfPhoneNumberTest {

    @Test
    public void testLetterCombinations1() {
        List<String> expect = Arrays.asList("a","b","c");
        assertEquals(expect, LetterCombinationsOfPhoneNumber.letterCombinations("2"));
    }
    @Test
    public void testLetterCombinations2() {
        List<String> expect = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expect, LetterCombinationsOfPhoneNumber.letterCombinations("23"));
    }

}
