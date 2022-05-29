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

import java.util.Stack;

public class BBallsGame {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt(), x = in.readInt();
        int[] a = in.readIntArray(n);
        Stack<Integer> st1 = new Stack<>(), st2 = new Stack<>();
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] == x && a[i] == a[i - 1]) {
                int c = count(a, i - 2, i + 1);
                max = max(c, max);
            }

        }
        out.printLine(max);

    }

    private int count(int[] a, int i, int j) {
        if (i < 0 && j < a.length) return j;
        if (j >= a.length && i >= 0) return a.length - i;
        if (i < 0 && j >= a.length) return a.length;
        if (a[i] != a[j]) return j - i - 1;

        if (i > 0 && a[i] == a[j] && a[i] == a[i - 1]) {
            return count(a, i - 1, j);
        } else if (j < a.length - 1 && a[i] == a[j] && a[j] == a[j + 1]) {
            return count(a, i, j + 1);
        } else {
            return count(a,i-1,j+1);
        }

    }
}
