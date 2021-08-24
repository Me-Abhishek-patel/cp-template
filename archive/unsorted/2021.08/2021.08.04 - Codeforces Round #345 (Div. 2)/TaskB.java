package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = in.readIntArray(n);
        int[] freq = new int[1001];
        for (int i : arr) {
            freq[i]++;
        }
        int max = 0;
        for (int i = 0; i < 1001; i++) {
            max = Math.max(max, freq[i]);
        }
        out.printLine(n - max);
    }
}
