package org.george.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {

    private static final String[][] ALPHA = {{"a", "b", "c"},{"d", "e", "f"}};

    public static List<String> letterCombinations(String digits) {
        List<String> letters = new ArrayList<String>();
        char[] numbers = digits.toCharArray();
        for(int i=0;i<digits.length();i++) {
            String[] s = ALPHA[Character.getNumericValue(numbers[i])-2];
            for(String a : s) {
                letters.add(a);
                System.out.println(a);
            }
        }
        return letters;
    }
}
