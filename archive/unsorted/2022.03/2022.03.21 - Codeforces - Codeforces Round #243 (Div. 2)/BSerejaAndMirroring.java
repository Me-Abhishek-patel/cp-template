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

public class BSerejaAndMirroring {


    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int[][] mat = in.readIntTable(n, m);
        int max = n;
        int k = n;
        while (k > 1) {
            if (k % 2 != 0) break;
            int mid = k / 2;
            int i = 0, j = k - 1;
            boolean x = true;
            while (i < j) {
                for (int idx = 0; idx < m; idx++) {
                    if (mat[i][idx] != mat[j][idx]) {
                        x = false;
                        break;
                    }
                }
                if (!x) break;
                i++;
                j--;
            }
            if (x) {
                max = mid;
                k /= 2;
            } else break;

        }
        out.printLine(max);
    }

    private void go(int[][] mat, int n) {
        if (n % 2 != 0) return;


    }
}
