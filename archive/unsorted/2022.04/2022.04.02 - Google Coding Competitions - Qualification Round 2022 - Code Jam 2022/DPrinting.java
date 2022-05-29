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

public class DPrinting {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int[][] a = in.readIntTable(3, 4);
        int[] min = new int[4];
        Arrays.fill(min, Integer.MAX_VALUE);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                min[i] = min(min[i], a[j][i]);
            }
        }
        long res = 1000000;
        long sum = sumArray(min);
        if (sum < 1000000) {
            out.printLine("Case #" + testNumber + ": IMPOSSIBLE");
        } else {
            out.print("Case #" + testNumber + ": ");
            out.print(max(min(res, min[0]), 0) + " ");
            res -= min[0];
            out.print(max(min(res, min[1]), 0) + " ");
            res -= min[1];
            out.print(max(min(res, min[2]), 0) + " ");
            res -= min[2];
            out.print(max(min(res, min[3]), 0) + " ");
            res -= min[3];
            out.printLine();

        }
    }
}
