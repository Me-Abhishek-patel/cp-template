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

public class CColumnSwapping {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int[][] a = in.readIntTable(n, m);
        int first = 0, second = 0;
        boolean done = false;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 1; j < m; j++) {
                if (a[i][j] < a[i][j - 1]) {
                    count++;
                    if (first == 0)
                        first = j;
                    else
                        second = j;
                }
            }
            if (count > 2) {
                out.printLine(-1);
                return;
            }
            if (count == 0) continue;
            if (count == 2) {
                swap(a, first - 1, second);
                done = true;
                first = first - 1;
                i = n + 1;
                break;
            } else if (count == 1) {
                done = true;
                swap(a, first - 1, first);
                second = first;
                first = first - 1;
                i = n + 1;
                break;
            }
        }
        if (!done) {
            out.printLine(1 + " " + 1);
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (a[i][j] < a[i][j - 1]) {
                    out.printLine(-1);
                    return;
                }
            }
        }
        out.printLine((first + 1) + " " + (second + 1));
    }

    private void swap(int[][] a, int i, int second) {
        for (int j = 0; j < a.length; j++) {
            int t = a[j][i];
            a[j][i] = a[j][second];
            a[j][second] = t;
        }
    }
}
