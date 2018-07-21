import org.george.leetcode.ThreeSum;
import org.george.leetcode.TowSum;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class ThreeSumTest {
    @Test
    public void test1() {
        List<Integer> one = Arrays.asList(-1, 0, 1);
        List<Integer> two = Arrays.asList(-1, -1, 2);
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(one);
        expect.add(two);
        assertEquals(expect, ThreeSum.threeSum(new Integer[]{-1, 0, 1, 2, -1, -4}));
    }

}
