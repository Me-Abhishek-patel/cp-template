package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;

public class CleanTheSequence {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[] a = in.readIntArray(n);
        if (k == 1) {
            out.printLine(0);
            return;
        }
        ArrayList<Integer> al = new ArrayList<>();
        al.add(a[0]);
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) al.add(a[i]);
        }
        long total = al.size() - 1;

        int[] ug = new int[k];
        n = al.size();
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                ug[al.get(i) - 1] += 1;
                continue;
            }
            if (al.get(i - 1).equals(al.get(i + 1))) {
                ug[al.get(i) - 1] += 2;
            } else {
                ug[al.get(i) - 1] += 1;
            }
        }
        for (int i = 0; i < k; i++) {
            out.print((total - ug[i]) + " ");
        }
        out.printLine();

    }
}
