package org.george.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {

    private static final String[][] ALPHA = {{"a", "b", "c"},{"d", "e", "f"},{"g", "h", "i"},{"j", "k", "l"},{"m", "n", "o"},{"p", "q", "r", "s"},{"t", "u", "v"},{"w","x", "y", "z"}};

    public static List<String> letterCombinations(String digits) {
        List<String> letters = new ArrayList<String>();
        char[] numbers = digits.toCharArray();
        for(int i=0;i<digits.length();i++) {
            String[] s = ALPHA[Character.getNumericValue(numbers[i])-2];
            if(i==0) {
                for(String a : s) {
                    letters.add(a);
                }
            } else {
                List<String> list = (List<String>) ((ArrayList<String>) letters).clone();
                letters.clear();
                for(String a : s) {
                    for (String letter : list) {
                        letters.add(letter + a);
                    }
                }
            }
        }
        return letters;
    }
}
