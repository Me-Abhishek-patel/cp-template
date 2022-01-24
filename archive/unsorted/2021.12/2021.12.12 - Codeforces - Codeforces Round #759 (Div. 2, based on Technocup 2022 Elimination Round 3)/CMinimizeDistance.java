package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class CMinimizeDistance {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[] x = in.readIntArray(n);

        PriorityQueue<Integer> posPq = new PriorityQueue<>(Collections.reverseOrder()),
                negPq = new PriorityQueue<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i : x) {
            if (!hm.containsKey(i)) {
                hm.put(i, 1);
            } else {
                hm.put(i, hm.get(i) + 1);
            }
            if (i > 0) posPq.add(i);
            else if (i < 0) negPq.add(i);
        }
        int min = negPq.isEmpty() ? 0 : Integer.MIN_VALUE,
                max = posPq.isEmpty() ? 0 : Integer.MIN_VALUE;
        long res = 0;
        while (!posPq.isEmpty()) {
            int cur = posPq.peek();
            res += cur * 2L;
            max = max(max, cur);
            for (int i = 0; i < k && !posPq.isEmpty(); i++) {
                cur = posPq.poll();
            }
//            if (cur != -1 && !posPq.isEmpty()) {
//                res += cur * 2L;
//            } else if (cur != -1 && posPq.isEmpty()) {
//                max = cur;
//                res += cur;
//            }
        }
        while (!negPq.isEmpty()) {
            int cur = abs(negPq.peek());
            res += cur * 2L;
            min = max(min, cur);
            for (int i = 0; i < k && !negPq.isEmpty(); i++) {
                cur = abs(negPq.poll());
            }
//            if (cur != -1 && !negPq.isEmpty()) {
//                res += cur * 2L;
//            } else if (cur != -1 && negPq.isEmpty()) {
//                min = cur;
//                res += cur;
//            }
        }
        res -= max(abs(min), abs(max));
        out.printLine(res);
    }
}
