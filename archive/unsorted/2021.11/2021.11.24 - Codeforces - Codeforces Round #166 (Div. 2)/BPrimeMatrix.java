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

public class BPrimeMatrix {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int[][] a = in.readIntTable(n, m);
        int[] primes = generatePrimes(110000);
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long t = 0;
            for (int j = 0; j < m; j++) {
                int idx = Arrays.binarySearch(primes, a[i][j]);
                if (idx < 0) {
                    idx = abs(idx + 1);
                }
                t += primes[idx] - a[i][j];
            }
            min = min(t, min);
        }
        for (int i = 0; i < m; i++) {
            long t = 0;
            for (int j = 0; j < n; j++) {
                int idx = Arrays.binarySearch(primes, a[j][i]);
                if (idx < 0) {
                    idx = abs(idx + 1);
                }
                t += primes[idx] - a[j][i];
            }
            min = min(t, min);
        }
        out.printLine(min);


    }
}
