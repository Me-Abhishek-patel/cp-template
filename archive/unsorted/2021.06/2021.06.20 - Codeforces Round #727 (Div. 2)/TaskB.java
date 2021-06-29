package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;
import net.egork.misc.ArrayUtils;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), q = in.readInt();
        long[] arr = new long[n];
        String s = in.readString();
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i) - 'a' + 1;
        }
        arr = ArrayUtils.prefixSumArray(arr);
        for (int i = 0; i < q; i++) {
            int x = in.readInt()-1;
            int y = in.readInt()-1;
            long left = x==0?0:arr[x-1];
            out.printLine(arr[y]-left);
        }

    }
}
