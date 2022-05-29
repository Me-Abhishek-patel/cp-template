package codes;

import static java.lang.Math.*;
import static java.lang.String.*;
import static net.cplibrary.numbers.IntegerUtils.MAX_VALUE;
import static net.cplibrary.numbers.IntegerUtils.MIN_VALUE;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;
import java.util.HashSet;

public class BGameOnRanges {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = new int[n + 2];
        int[][] range = new int[n][3];
        for (int i = 0; i < n; i++) {
            int l = in.readInt(), r = in.readInt();
            range[i][0] = l;
            range[i][1] = r;
            a[l] += 1;
            a[r + 1] -= 1;
        }
        for (int i = 1; i < n; i++) {
            a[i] += a[i - 1];
        }
        Arrays.sort(range, (x, y) -> (x[1] - x[0]) - (y[1] - y[0]));
//        out.printIntTable(range);
        HashSet<Integer> hs = new HashSet<>();
        for (int[] ints : range) {
            int min = Integer.MAX_VALUE;

            for (int i = ints[0]; i <= ints[1]; i++) {
                if (min >= a[i] && !hs.contains(i)) {
                    min = i;
                }
                a[i]--;
            }
            ints[2] = min;
            hs.add(min);
        }
        out.printIntTable(range);
        
    }
}
