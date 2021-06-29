package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readInt(), x = in.readInt(), t = in.readInt();

        long c = Math.min((t / x), (n - 1));

        long res = (n-c)*c+(c*(c-1))/2;
        out.printLine(res);
    }
}
