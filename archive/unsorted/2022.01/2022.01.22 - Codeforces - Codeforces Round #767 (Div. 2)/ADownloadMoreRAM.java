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
import java.util.Comparator;

public class ADownloadMoreRAM {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = in.readInt();

        }
        for (int i = 0; i < n; i++) {
            a[i][1] = in.readInt();

        }
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int v = o1[0] - o2[0];
                if (v != 0) return v;
                return o2[1] - o1[1];
            }
        });
        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i][0] <= k) k+= a[i][1];
        }
        out.printLine(k);


    }
}
