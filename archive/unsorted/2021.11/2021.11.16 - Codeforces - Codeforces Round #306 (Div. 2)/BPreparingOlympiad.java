package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BPreparingOlympiad {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), l = in.readInt(), r = in.readInt(), x = in.readInt();
        int[] a = in.readIntArray(n);
        int limit = (1 << n);
        int count = 0;
        for (int i = 0; i < limit; i++) {
            long sum = 0;
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += a[j];
                    min = Math.min(min, a[j]);
                    max = Math.max(max, a[j]);
                }
            }
            if (l <= sum && sum <= r && max - min >= x) count++;
        }
        out.printLine(count);
    }
}
