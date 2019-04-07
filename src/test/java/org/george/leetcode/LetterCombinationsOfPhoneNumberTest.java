package org.george.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class LetterCombinationsOfPhoneNumberTest {

    @Test
    public void testLetterCombinations1() {
        List<String> expect = Arrays.asList("a", "b", "c");
        assertEquals(expect, LetterCombinationsOfPhoneNumber.letterCombinations("2"));
    }

    @Test
    public void testLetterCombinations2() {
        List<String> expect = Arrays.asList("ad", "bd", "cd", "ae", "be", "ce", "af", "bf", "cf");
        assertEquals(expect, LetterCombinationsOfPhoneNumber.letterCombinations("23"));
    }

    @Test
    public void testLetterCombinations3() {
        List<String> expect = Arrays.asList("add", "bdd", "cdd", "aed", "bed", "ced", "afd", "bfd", "cfd", "ade", "bde", "cde", "aee", "bee", "cee", "afe", "bfe", "cfe", "adf", "bdf", "cdf", "aef", "bef", "cef", "aff", "bff", "cff");
        assertEquals(expect, LetterCombinationsOfPhoneNumber.letterCombinations("233"));
    }

}
