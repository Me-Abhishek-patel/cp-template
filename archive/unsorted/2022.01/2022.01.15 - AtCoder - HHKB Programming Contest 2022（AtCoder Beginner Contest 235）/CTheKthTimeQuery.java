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
import java.util.HashMap;

public class CTheKthTimeQuery {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), q = in.readInt();
        int[] a = in.readIntArray(n);
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> al = hm.getOrDefault(a[i], new ArrayList<>());
            al.add(i);
            hm.put(a[i], al);
        }
        for (int i = 0; i < q; i++) {
            int x = in.readInt(), k = in.readInt();
            if (hm.containsKey(x) && k <= hm.get(x).size()) {
                out.printLine(1 + hm.get(x).get(k - 1));
            } else out.printLine(-1);
        }
    }
}
