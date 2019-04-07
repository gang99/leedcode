package org.george.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomSortString {
    public static String customSortString(String S, String T) {
        if (S == null) {
            return T;
        }
        Map<Byte, Integer> sort = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            sort.put(S.getBytes()[i], i);
        }
        int[] out = new int[sort.size()];
        List<Byte> others = new ArrayList<>();
        for (Byte b : T.getBytes()) {
            Integer pos = sort.get(b);
            if (pos != null) {
                out[pos]++;
            } else {
                others.add(b);
            }
        }
        List<Byte> result = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            for (int n = 0; n < out[i]; n++) {
                result.add(S.getBytes()[i]);
            }
        }
        result.addAll(others);
        return byteListToString(result);
    }

    private static String byteListToString(List<Byte> l) {
        if (l == null) {
            return "";
        }
        byte[] array = new byte[l.size()];
        int i = 0;
        for (Byte current : l) {
            array[i] = current;
            i++;
        }
        return new String(array);
    }
}
