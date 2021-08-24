package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readLong(), k = in.readLong();
        while (true) {
            long mid = (1L << (n - 1));
            if (k == mid) {
                out.printLine(n);
                return;
            } else if (k < mid) {
                n--;
            }else {
                n--;
                k-=mid;
            }
        }
    }
}
