package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        double max = ArrayUtils.maxElement(a);
        double sum = ArrayUtils.sumArray(a);
        out.printLine((sum - max) / (n - 1) + max);
    }
}
