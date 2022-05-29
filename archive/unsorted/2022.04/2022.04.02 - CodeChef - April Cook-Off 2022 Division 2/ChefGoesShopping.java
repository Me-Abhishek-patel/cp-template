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

public class ChefGoesShopping {
    long sum = 0;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        sum = 0;
        int[] l = in.readIntArray(n);
        int[] r = in.readIntArray(n);
        go(l, r, 0, n - 1);
        out.printLine(sum);
    }

    private void go(int[] l, int[] r, int i, int j) {
        if (i==j) return;
        int min = MAX_VALUE, p = 0;
        boolean isLeft = true;
        for (int k = i; k <= j; k++) {
            if (k != i && l[k] < min) {
                p = k;
                min = l[k];
                isLeft = true;
            }
            if (k != j && r[k] < min) {
                p = k;
                min = r[k];
                isLeft = false;
            }
        }

        sum += min;
        if (isLeft) {
            go(l, r, i, p - 1);
            go(l, r, p, j);
        }else {
            go(l, r, i, p);
            go(l, r, p+1, j);
        }

    }
}
