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

public class BConsecutivePointsSegment {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int st = a[0];
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (a[i] - 1 == st || a[i] == st || a[i] + 1 == st) {
                st++;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            out.printLine("YES");
            return;
        }
        st = a[0] + 1;
        flag = true;
        for (int i = 0; i < n; i++) {
            if (a[i] - 1 == st || a[i] == st || a[i] + 1 == st) {
                st++;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            out.printLine("YES");
            return;
        }
        st = a[0] + 2;
        flag = true;
        for (int i = 0; i < n; i++) {
            if (a[i] - 1 == st || a[i] == st || a[i] + 1 == st) {
                st++;
            } else {
                flag = false;
                break;
            }
        }
        if(flag){
            out.printLine("YES");
            return;
        }
        out.printLine("NO");
    }
}
