package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;
import java.util.HashSet;

public class CKMultipleFreeSet {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        long[] a = in.readLongArray(n);
        Arrays.sort(a);
        HashSet<Long> hs = new HashSet<>();
        int res = 0;
        if(k==1) {
            out.printLine(n);
            return;
        }
        for (int i = n - 1; i >= 0; i--) {
            int idx = Arrays.binarySearch(a, (long) a[i] * k);
            int idx2 = Arrays.binarySearch(a, (long) a[i] / k);
            if (idx >= 0 && idx2 >= 0 && !hs.contains(a[idx]) && !hs.contains(a[idx2]))
                hs.add(a[i]);
            else res++;
        }
        for (int i = n - 1; i >= 0; i--) {
            int idx = Arrays.binarySearch(a, (long) a[i] * k);

            if (idx >= 0 && !hs.contains(a[idx]) )
                hs.add(a[i]);
            else res++;
        }
        out.printLine(n-hs.size());
    }
}
