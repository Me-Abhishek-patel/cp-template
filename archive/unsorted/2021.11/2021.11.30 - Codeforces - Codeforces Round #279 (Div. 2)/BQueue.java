package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;

public class BQueue {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        HashMap<Integer, Integer> hm1 = new HashMap<>(), hm2 = new HashMap<>();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int x = in.readInt(), y = in.readInt();
            hm1.put(x, y);
            hm2.put(y, x);
        }
        int x = 0, idx = 1, y = 0, idy = n - 2;
        for (int i = 0; idx < n || idy >= 0; i++) {

            if (idx < n) {
                a[idx] = hm1.get(x);
                hm1.remove(x);
                x = a[idx];
                idx += 2;
            }
            if (idy >= 0) {
                a[idy] = hm2.get(y);
                y = a[idy];
                hm2.remove(y);
                idy -= 2;
            }

        }

        out.printLine(a);

    }
}
