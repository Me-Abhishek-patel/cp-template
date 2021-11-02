package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

import java.util.Arrays;

public class CApplemanAndToastman {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        Arrays.sort(a);
        long s = ArrayUtils.sumArray(a);
        long t = s;
        for (int i = 0; i <= n - 2; i++) {
            s += t;
            t -= a[i];
        }
        out.printLine(s);
    }
}
