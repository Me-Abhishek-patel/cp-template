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

import java.util.*;

public class Task {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), l = in.readInt();
        int[][] a = new int[n][3];

        int[] line = new int[n + 1];


        for (int i = 1; i <= n; i++) {
            a[i - 1][0] = in.readInt();
            a[i - 1][1] = in.readInt();
            a[i - 1][2] = i;
            line[a[i - 1][0]]++;
        }

        out.print("Case #" + testNumber + ": ");
        int count = 0;
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        while (lhs.size() < n) {
            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if (!lhs.contains(a[i][2]) && !hs.contains(a[i][2])) {
                    if (a[i][1] == 1) {
                        line[a[i][0]]--;
                        a[i][0]++;
                        line[a[i][0]]++;


                    } else {
                        line[a[i][0]]--;
                        a[i][0]--;
                        line[a[i][0]]++;

                    }
                    if (a[i][0] == l || a[i][0] == 0) {
                        lhs.add(a[i][2]);
                    }
                }
            }
        }

    }
}
