package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BPaintingEggs {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[][] a = new int[n][4];
        long s1 = 0, s2 = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int x = in.readInt(), g = in.readInt();

            if (abs((s1 + x) - s2) <= 500) {
                s1 += x;
                sb.append("A");
            } else {
                s2+=g;
                sb.append("G");

            }
        }
        out.printLine(sb);

    }
}
