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

public class AFloorCeilDecomposition {
    static int mod = 998244353;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long x = in.readLong();
        HashMap<Long, Long> dp = new HashMap<>();

        out.printLine(go(x, dp));
    }

    private long go(long x, HashMap<Long, Long> dp) {
        if (x == 2 || x == 3) return x;
        if(dp.containsKey(x)) return dp.get(x);
        long res =  (go(x / 2, dp) * go(x - (x / 2), dp) ) % mod;
        dp.put(x,res);
        return res;
    }
}
