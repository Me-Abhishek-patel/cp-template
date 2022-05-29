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

import java.util.Collections;
import java.util.PriorityQueue;

public class ValentineVex {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long[] a = in.readLongArray(n);
        boolean flag = false;
        long sum1 = extracted(a, false);
        long sum2 = extracted(a, true);
        out.printLine(Math.max(sum1,sum2));
        out.printLine(sum1+" "+sum2);

    }

    private long extracted(long[] a, boolean flag) {
        long sum1 = 0;
        PriorityQueue<Long> epq = new PriorityQueue<>(Collections.reverseOrder()), odpq = new PriorityQueue<>(Collections.reverseOrder());
        for (long l : a) {
            if (l % 2 == 0) {
                epq.add(l);
            } else
                odpq.add(l);
        }


        while (!odpq.isEmpty() || !epq.isEmpty()) {
            if (flag) {
                long x = epq.isEmpty() ? 0 : epq.poll();
                long y = epq.isEmpty() ? 0 : epq.poll();
                sum1 += Math.max(x, y);
            } else {
                long x = odpq.isEmpty() ? 0 : odpq.poll();
                long y = odpq.isEmpty() ? 0 : odpq.poll();
                sum1 += Math.max(x, y);
            }
            flag = !flag;
        }
        return sum1;
    }
}
