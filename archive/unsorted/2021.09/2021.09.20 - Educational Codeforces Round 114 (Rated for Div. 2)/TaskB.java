package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long a = in.readInt(), b = in.readInt(), c = in.readInt(), m = in.readInt();
        if (m > a + b + c - 3L) {
            out.printLine("NO");
            return;
        }
        long sum = a + b + c;
        long max = Math.max(a, Math.max(b, c));
        long diff = max - (sum - max) - m;
        if (diff > 1){
            out.printLine("NO");
        }else {
            out.printLine("YES");
        }

    }
}
