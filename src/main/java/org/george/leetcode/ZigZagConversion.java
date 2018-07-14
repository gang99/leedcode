package org.george.leetcode;

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        if(numRows < 2) return s;
        int m = 2 * (numRows - 1);
        int n = 0;
        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();
        for(int j=0;j<numRows;j++) {
            int i = j;
            int k = 0;
            while (i < chars.length) {
                result.append(chars[i]);
                if((k % 2 == 0 || n == 0) && m != 0 ) {
                    i = i + m;
                } else {
                    i = i + n;
                }
                k++;
            }
            m = m - 2;
            n = n + 2;
        }
        return result.toString();
    }
}
