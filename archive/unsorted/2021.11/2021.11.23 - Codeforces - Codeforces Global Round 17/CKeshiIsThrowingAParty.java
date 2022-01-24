package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class CKeshiIsThrowingAParty {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[][] a = new int[n][3];
        for (int i = 0; i < n; i++) {
            a[i][2] = i;
            a[i][0] = in.readInt();
            a[i][1] = in.readInt();
        }
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int count = 0, rcount = 0;

        for (int i = 0; i < n; i++) {
            int greater = n - i - 1;
            int lower = i - count;
            int diff = 0;
            if (greater > a[i][0]) {
                diff += greater - a[i][0];
            }
//            if (lower > a[i][1]) {
//                diff += lower - a[i][1];
//            }
            if (diff >= 1) {
                count++;
            }
        }
        out.printLine(n - count);
    }
}
