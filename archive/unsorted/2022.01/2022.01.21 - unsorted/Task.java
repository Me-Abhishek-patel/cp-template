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

public class Task {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int N = in.readInt();
        String s = in.readLine();

        int[] c = new int[N];
        for (int i = 0; i < N; i++) {
            c[i] = in.readInt();
        }
        int cost1 = 0;
        int min = Integer.MAX_VALUE;
        int prev = 0;
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == '0' + prev) cost1 += c[i];
            prev = 1 - prev;
        }
        min = Math.min(min, cost1);
        cost1 = 0;
        prev = 1;
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == '0' + prev) cost1 += c[i];
            prev = 1 - prev;
        }
        min = Math.min(min, cost1);
        cost1 = 0;
        int t = 1;
        prev = 0;
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == '0' + prev) cost1 += c[i];
            if (t == 2) {
                prev = 1 - prev;
                t = 0;
            }
            t++;

        }
        min = Math.min(min, cost1);
        cost1 = 0;
        t = 1;
        prev = 1;
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == '0' + prev) cost1 += c[i];
            if (t == 2) {
                prev = 1 - prev;
                t = 0;
            }
            t++;

        }
        min = Math.min(min, cost1);
        cost1 = 0;
//        return min;
        out.printLine(min);
    }
}
