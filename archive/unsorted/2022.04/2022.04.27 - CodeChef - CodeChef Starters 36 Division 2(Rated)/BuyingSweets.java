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

import net.cplibrary.generated.collections.pair.LongLongPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.*;

public class BuyingSweets {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long r = in.readLong();
        long[][] a = new long[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = in.readLong();
        }
        for (int i = 0; i < n; i++) {
            a[i][1] = in.readLong();
        }
        Arrays.sort(a, new Comparator<long[]>() {
            @Override
            public int compare(long[] o1, long[] o2) {
                int x = Long.compare(o1[1], o2[1]);
                if (x != 0) return x;
                else return -1 * Long.compare(o1[0], o2[0]);
            }
        });


        Stack<long[]> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.isEmpty()) st.push(a[i]);
            else {
                while (!st.isEmpty() && st.peek()[0] >= a[i][0]) {
                    st.pop();
                }
                st.push(a[i]);
            }
        }


        long ans = 0;
        while (r > 0 && !st.isEmpty()) {
//            out.print("[ " + st.peek()[0] + "  " + st.peek()[1] + "   " + r + "]");
            if (r >= st.peek()[0]) {
//                long x = 1 + ((r - st.peek()[0]) / (st.peek()[0] - st.peek()[1]));
////                out.printLine(x);
//                if (x > 0) {
//                    ans += x;
//                    r = r + (-(x * st.peek()[0]) + x * st.peek()[1]);
//                }
                long y = st.peek()[0], z = st.peek()[1];
                while (r >= y) {
                    long c = r / y;
                    ans += c;
                    r %= y;
                    r += z * c;


                }
            }
            st.pop();
        }
//        out.printLine();
        out.printLine(ans);


    }
}
