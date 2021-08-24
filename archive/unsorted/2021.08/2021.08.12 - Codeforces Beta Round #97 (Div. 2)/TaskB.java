package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.readInt(), c = in.readInt();
        int b = 0;
        int mul = 1;
        while (a > 0 || c > 0) {
            int c1 = a % 3, c2 = c % 3;
            b += ((c2 - c1 + 3) % 3) * mul;
            mul *= 3;
            a /= 3;
            c /= 3;
        }
        out.printLine(b);
    }
}
