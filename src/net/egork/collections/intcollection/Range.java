package net.egork.collections.intcollection;

import net.egork.generated.collections.list.IntArray;
import net.egork.generated.collections.list.IntList;

/**
 * @author Abhishek Patel (abhishekpatelmrj@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/abhishek-p-6733b3195/ )
 */
public class Range {
    public static IntList range(int from, int to) {
        int[] result = new int[Math.abs(from - to)];
        int current = from;
        if (from <= to) {
            for (int i = 0; i < result.length; i++) {
                result[i] = current++;
            }
        } else {
            for (int i = 0; i < result.length; i++) {
                result[i] = current--;
            }
        }
        return new IntArray(result);
    }

    public static IntList range(int n) {
        return range(0, n);
    }
}
