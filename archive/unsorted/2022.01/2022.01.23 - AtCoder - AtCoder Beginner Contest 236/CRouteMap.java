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

import java.util.Arrays;
import java.util.HashSet;

public class CRouteMap {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        String[] s = in.readLine().split(" "), t = in.readLine().split(" ");
        HashSet<String> hs = new HashSet<>();
        hs.addAll(Arrays.asList(t));
        for (String s1 : s) {
            out.printLine(hs.contains(s1) ? "Yes" : "No");
        }
    }
}
