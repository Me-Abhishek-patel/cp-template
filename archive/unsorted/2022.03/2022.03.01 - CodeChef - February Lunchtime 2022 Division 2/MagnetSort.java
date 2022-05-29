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

public class MagnetSort {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
//        out.printLine("testNumber" +" "+testNumber);
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        String s = in.readLine();
        if (n == 1) {
            out.printLine(0);
            return;
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        Arrays.sort(b);
//        out.printLine(a);
//        out.printLine(b);
        boolean isAlreadySorted = true;
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                isAlreadySorted = false;
            }
        }
//        out.printLine(isAlreadySorted);
        if (isAlreadySorted) {
            out.printLine(0);
            return;
        }

        if (!s.contains("N") || !s.contains("S")) {
            out.printLine(-1);
            return;
        }
        int i = 0, j = n - 1;
        if (s.charAt(0) != s.charAt(j)) {
            out.printLine(1);
            return;
        }
        int p = -1, q = -1;
        int count = 0;
        while (i < n) {
            if (s.charAt(i) != s.charAt(n - 1)) {
                p = i;
                break;
            }
            if (a[i] == b[i]) {
                i++;
            } else break;
        }
        if (p != -1) {
            out.printLine(1);
            return;
        }
        while (j >= 0) {
            if (s.charAt(j) != s.charAt(0)) {
                q = j;
                break;
            }
            if (a[j] == b[j])
                j--;
            else break;
        }
        if (q != -1) {
            out.printLine(1);
            return;
        }
        out.printLine(2);
    }
}
