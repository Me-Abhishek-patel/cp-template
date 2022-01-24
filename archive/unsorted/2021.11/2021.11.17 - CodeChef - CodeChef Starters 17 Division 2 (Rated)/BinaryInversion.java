package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.string.StringUtils;

import java.util.Arrays;
import java.util.Comparator;

public class BinaryInversion {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        String[] s = in.readStringArray(n);
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = i;
            a[i][1] = StringUtils.count(s[i], '0');
        }
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        long res = 0;
        long z = 0;
        for (int i = n - 1; i >= 0; i--) {
            String t = s[a[i][0]];

            for (int j = t.length() - 1; j >= 0; j--) {
                char c = t.charAt(j);
                if (c == '0') {
                    z++;
                } else {
                    res += z;
                }
            }

        }
        out.printLine(res);

    }
}
