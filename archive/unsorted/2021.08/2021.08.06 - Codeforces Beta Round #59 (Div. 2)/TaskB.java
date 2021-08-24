package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[] freq = new int[k + 1];
        for (int i = 0; i < n; i++) {
            freq[in.readInt()]++;
        }

        int res = 0;
        while (freq[k] != n) {
            for (int i = k-1; i>=0; i--) {
                if (freq[i] > 0) {
                    freq[i]--;
                    freq[i+1]++;
                }
            }
            res++;
        }
        out.printLine(res);
    }
}
