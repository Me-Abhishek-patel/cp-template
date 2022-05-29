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

import java.util.HashMap;

public class BStoneAgeProblem {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), q = in.readInt();
        HashMap<Integer, Long> hm = new HashMap<>();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            long x = in.readLong();
            hm.put(i, x);
            sum += x;
        }

        long prev = 0;
        for (int i = 0; i < q; i++) {
            if (in.readInt() == 1) {
                int idx = in.readInt();
                long x = in.readLong();
                sum -= hm.getOrDefault(idx, prev);
                sum += x;
                hm.put(idx, x);

            } else {
                prev = in.readLong();
                sum = n * prev;
                hm = new HashMap<>();
            }
            out.printLine(sum);
        }

    }
}
