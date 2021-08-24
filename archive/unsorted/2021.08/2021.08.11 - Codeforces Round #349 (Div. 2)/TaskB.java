package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        long sum = ArrayUtils.sumArray(a);
        int max = ArrayUtils.maxElement(a);
        out.printLine(max - (sum-max)+1);

    }
}
