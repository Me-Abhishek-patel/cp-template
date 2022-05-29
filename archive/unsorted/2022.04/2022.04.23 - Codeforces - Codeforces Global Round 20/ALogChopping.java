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

public class ALogChopping {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        boolean e = true;
        for (int i : a) {
            pq.add(i);
        }
        while (!pq.isEmpty() && pq.peek() != 1) {
            int x = pq.poll();
            int y = x / 2;
            int z = x - y;
            pq.add(y);
            pq.add(z);
            e = !e;
        }
        out.printLine(!e?"errorgorn":"maomao90");

    }
}
