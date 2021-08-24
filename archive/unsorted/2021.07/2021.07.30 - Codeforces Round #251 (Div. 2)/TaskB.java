package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), x = in.readInt();
        Long[] chaps = new Long[n];
        for (int i = 0; i < n; i++) {
            chaps[i] = in.readLong();
        }
        Arrays.sort(chaps);
        long sum = 0;
        for (long i : chaps) {
            sum += i * Math.max(x, 1);
            x--;
        }
        out.printLine(sum);
    }
}
