package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.numbers.IntegerUtils;

import java.util.TreeSet;

public class GuestsLikeSlippers {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] s = in.readIntArray(n);
        TreeSet<Integer> ts = new TreeSet<>();
        long res = (long) IntegerUtils.power(2L, (long) n, 998244353L);
        long ans = 1;
        for (int i : s) {
            ts.add(i);
                
        }

    }
}
