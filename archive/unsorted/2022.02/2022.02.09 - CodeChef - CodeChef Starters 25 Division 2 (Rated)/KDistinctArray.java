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

public class KDistinctArray {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readInt(), k = in.readInt();
        long t = k, t2 = n, digit = 0;
        long p = 0;
        while (t > 0 && t2 > 0) {
            digit++;
            long tp = t2;
            t -= t2;
            t2--;
            if (t <= 0 || t2 <= 0) break;
            p += tp;

        }
        long shift = k - p;
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (long i = 1; i <= digit; i++) {
            sb.append(i).append(" ");
            count++;
        }
        long i = 0;
        for (long j = 0; j < shift - 1; j++) {
            sb.append(i + 1).append(" ");
            count++;
            i = (i + 1) % digit;
        }
        digit--;
        long rem = n - count;

        i = digit;
        StringBuilder sb2 = new StringBuilder();
        for (long j = 0; j < rem; j++) {
            sb2.append(i).append(" ");
            i--;
            if (i == 0) i = digit;
        }
        out.print(sb2.reverse().toString().trim());
        if (sb2.length() != 0) {
            out.print(" ");
        }
        out.printLine(sb);



    }
}
