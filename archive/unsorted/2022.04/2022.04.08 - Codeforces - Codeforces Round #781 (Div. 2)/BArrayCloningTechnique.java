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

public class BArrayCloningTechnique {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        for (int i : a) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        int max = 0;
        for (Integer value : hm.values()) {
            max = Math.max(value, max);
        }
        if (max == n) {
            out.printLine(0);
            return;
        }
        int curr = max;
        int count = 0;
        int req = n - max;
        while (curr < n) {
            curr += curr;
            count++;
        }
        out.printLine(req + count);

    }
}
