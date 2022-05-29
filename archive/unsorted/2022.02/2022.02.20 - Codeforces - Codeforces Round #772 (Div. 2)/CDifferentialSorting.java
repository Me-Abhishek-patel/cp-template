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

public class CDifferentialSorting {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        if (a[n - 1] < a[n - 2]) {
            out.printLine(-1);
            return;
        }
        if (a[n - 1] < 0 && a[n - 2] < 0) {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    out.printLine(-1);
                    return;
                }
            }
            out.printLine(0);
            return;
        }
        out.printLine(n - 2);
        for (int i = n - 2; i >= 1; i--) {
            out.printLine(i + " " + (n - 1) + " " + (n));
        }
        return;
//        int[] b = new int[n];
//        b[n - 1] = a[n - 1];
//        b[n - 2] = a[n - 2];
//        int y = n - 2, z = n - 1;
//        int count = 0;
//        StringBuilder sb = new StringBuilder();
//        for (int i = n - 3; i >= 0; i--) {
//            if (b[y] - b[z] <= a[i + 1]) {
//                b[i] = b[y] - b[z];
//                count++;
//                sb.append((i + 1) + " " + (y + 1) + " " + (z + 1)).append("\n");
//            } else {
//                b[i] = a[i];
//            }
//            if (b[i] - b[i + 1] < b[y] - b[z]) {
//                y = i;
//                z = i + 1;
//            }
//        }
//        for (int i = 0; i < n - 1; i++) {
//            if (b[i] > b[i + 1]) {
//                out.printLine(-1);
//                return;
//            }
//        }
//        out.printLine(count);
//        out.printLine(sb);
    }
}
