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
import org.rocksdb.HashSkipListMemTableConfig;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

public class DTraps {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[] a = in.readIntArray(n);
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> a[x] - a[y]);
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            pq.add(i);
        }
        for (int i = 0; i < k; i++) {
            out.printLine(pq.peek());
            hs.add(pq.poll());
        }
        long sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (hs.contains(i)) count++;
            else {
                sum += (a[i] + count);
            }
        }
        out.printLine(sum);


    }
}
