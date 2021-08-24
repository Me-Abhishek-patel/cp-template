package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int[][] t = in.readIntTable(5, 5);
        int[] a = {0, 1, 2, 3, 4};
        int i = 0;
        long max = 0;
        do {
            long c = t[a[0]][a[1]] + t[a[1]][a[0]] + (t[a[2]][a[3]] + t[a[3]][a[2]]) * 2L + t[a[1]][a[2]] + t[a[2]][a[1]] +
                    (t[a[3]][a[4]] + t[a[4]][a[3]]) * 2L;
            max = Math.max(c, max);
        } while (ArrayUtils.nextPermutation(a));
        out.printLine(max);

    }
}
