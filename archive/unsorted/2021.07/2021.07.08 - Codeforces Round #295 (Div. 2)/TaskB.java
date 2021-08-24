package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        if (m <= n) {
            out.printLine(n - m);
            return;
        }
        int count = 0;
        while (n < m) {
            n <<= 1;
            count++;
        }
        int k = n >> 1;
        out.printLine(count + n - m);
    }
}
