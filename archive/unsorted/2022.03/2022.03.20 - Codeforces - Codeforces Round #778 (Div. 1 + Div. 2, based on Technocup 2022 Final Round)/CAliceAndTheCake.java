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
import java.util.TreeMap;

public class CAliceAndTheCake {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long[] a = in.readLongArray(n);
        TreeMap<Long, Integer> tm = new TreeMap<>();
        long sum = 0;
        for (long i : a) {
            sum += i;
            if (tm.containsKey(i)) {
                tm.put(i, tm.get(i) + 1);
            } else {
                tm.put(i, 1);
            }
        }
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(sum);
        while (!pq.isEmpty() && !tm.isEmpty()) {
            long num = pq.poll();
            if (num < tm.lastKey()) {
                out.printLine("NO");
                return;
            }
            if (tm.containsKey(num)) {
                int count = tm.get(num);
                if (count == 1) {
                    tm.remove(num);
                } else {
                    tm.put(num, count - 1);
                }
            } else {
                if (num == 1) {
                    out.printLine("NO");
                    return;
                }
                long n1 = num / 2;
                long n2 = num - n1;
                pq.add(n1);
                pq.add(n2);
            }
        }
        out.printLine(pq.isEmpty() && tm.isEmpty() ? "YES" : "NO");
    }
}
