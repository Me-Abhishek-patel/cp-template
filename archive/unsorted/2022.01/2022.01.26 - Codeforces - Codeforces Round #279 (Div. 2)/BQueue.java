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
import java.util.HashSet;
import java.util.LinkedHashSet;

public class BQueue {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        HashMap<Integer, Integer> hm1 = new HashMap<>(), hm2 = new HashMap<>();
        int[] a = new int[n];
        LinkedHashSet<Integer> hs = new LinkedHashSet<>(),hs2 = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            int x = in.readInt(), y = in.readInt();
            hs.add(x);
            hs2.add(y);

            hm1.put(x, y);
            hm2.put(y, x);
        }
        hs.removeAll(hs2);

        a[1] = hm1.get(0);
        a[n - 2] = hm2.get(0);


        int x = 0, idx = 1, y = 0, idy = n - 2;
//        int tidx = 0, tx = hs.iterator().next();
        if (n % 2 != 0) {
            hm1.put(-1, hs.iterator().next());
            x = -1;
            idx = 0;
        }
        for (int i = 0; idx < n || idy >= 0; i++) {
//            if (!hs.isEmpty() && tidx < n) {
//                a[tidx] = tx;
//                tx = hm1.get(tx);
//                tidx += 2;
//            }

            if (idx < n) {
                a[idx] = hm1.get(x);
                x = a[idx];
                idx += 2;
            }
            if (idy >= 0) {
                a[idy] = hm2.get(y);
                y = a[idy];
                idy -= 2;
            }

        }
        out.printLine(a);
    }
}
