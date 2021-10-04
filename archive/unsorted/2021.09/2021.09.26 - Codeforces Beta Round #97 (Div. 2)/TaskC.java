package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

import java.util.Arrays;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int idx = ArrayUtils.maxPosition(a);
        if (a[idx] != 1)
            a[idx] = 1;
        else a[idx] = 2;
        Arrays.sort(a);
        out.printLine(a);
    }
}
