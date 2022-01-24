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

public class BHammingDistanceSum {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String a = in.readLine();
        String b = in.readLine();
        int[][] f = new int[b.length() + 1][2];
        for (int i = 1; i <= b.length(); i++) {
            for (int j = 0; j < 2; j++) {
                f[i][j] = f[i - 1][j];
            }
            f[i][b.charAt(i - 1) - '0']++;
        }
        long res = 0;
        for (int i = 0; i < a.length(); i++) {
            int c = a.charAt(i)-'0';
            for (int j = 0; j < 2; j++) {
                res += (long) abs(c - j) * (f[b.length() - a.length() + i + 1][j] - f[i][j]);
            }
        }
        out.printLine(res);

    }
}
