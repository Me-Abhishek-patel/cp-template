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

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;
import java.util.HashSet;

public class BShuffle {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), x = in.readInt(), m = in.readInt();
        HashSet<IntIntPair> interv = new HashSet<>();
        int left = x, right = x;
        for (int i = 0; i < m; i++) {
            int l = in.readInt(), r = in.readInt();
            if (right < l || r < left) {
                continue;
            } else {
                left = min(left, min(l, min(right, r)));
                right = max(left, max(l, max(right, r)));
            }
        }
        out.printLine(right - left + 1);

    }
}
