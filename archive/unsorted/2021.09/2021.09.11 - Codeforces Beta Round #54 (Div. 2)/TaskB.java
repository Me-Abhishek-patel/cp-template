package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int t = n;
        while (n > 1) {

            if (t % n == 0) {
                out.printLine(n);
                t=n;
            }
            n--;

        }
        out.print(1);
    }
}
