package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;
import net.cplibrary.numbers.IntegerUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BMaxAndMex {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[] a = in.readIntArray(n);
        Arrays.sort(a);
        int mex = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != i) {
                mex = i;
                break;
            }
        }
        if (mex == -1) mex = n;
        HashSet<Integer> hs = new HashSet<>();
        int max = ArrayUtils.maxElement(a);
        for (int i : a) {
            hs.add(i);
        }
        int distinct = hs.size();
        if (mex < max && k!=0) {
            int p = (int) Math.ceil((max + mex) / 2.0);
            if (!hs.contains(p)) distinct++;

        } else {
            distinct += k;
        }


        out.printLine(distinct);
    }
}
