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

import java.util.*;

public class MexyArray {
    int MAX = (int) (1e9 - 1);

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] b = in.readIntArray(n);
        int[] a = new int[n];
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (b[i] > i + 1) {
                out.printLine(-1);
                return;
            }
            if (b[i] != -1) {
                st.push(b[i]);
                al.add(b[i]);
                hs.add(b[i]);
            }
        }
        Arrays.fill(a, -1);
        for (int i = 1; i < al.size(); i++) {
            if (al.get(i) < al.get(i - 1)) {
                out.printLine(-1);
//                out.printLine(2);
                return;
            }
        }
        al.clear();
        int max = st.peek();
        for (int i = n - 1; i >= 0; i--) {
            if (st.peek() == b[i]) {
                st.pop();
            }
            if (!st.isEmpty() && b[i] != -1) {
                a[i] = st.peek();
            }

        }
        int l = n - 1;
        while (l >= 0 && b[l] == -1) {
            l--;
        }
//        out.printLine(a);
//        out.printLine(Arrays.toString(hs.toArray()));
        int cur = max - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] != -1) continue;
//            out.printLine(cur);
            if (i > l) {
                a[i] = MAX;
                continue;
            }
            while (hs.contains(cur)) {
                if (cur != 0)
                    cur--;
                else cur = MAX;
            }

            a[i] = cur;
            if (cur != 0)
                cur--;
            else cur = MAX;


        }
        out.printLine(a);

    }
}
