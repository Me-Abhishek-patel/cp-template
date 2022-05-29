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

import java.util.HashSet;

public class BDormsWar {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int prev = 0;
        int n = in.readInt();
        String s = in.readLine();
        int k = in.readInt();
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < k; i++) {
            hs.add(in.next().charAt(0));
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (hs.contains(s.charAt(i))) {
                max = max(i - prev, max);
                prev = i;
            }
        }
        out.printLine(max);
    }
}
