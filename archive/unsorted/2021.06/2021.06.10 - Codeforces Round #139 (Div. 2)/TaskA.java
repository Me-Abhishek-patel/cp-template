package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int t = in.readInt();
        int s = 7-t;
        for (int i = 0; i < n; i++) {
            int l = in.readInt(), r = in.readInt();
            if (t == l || t == r || l == r || s == l || s == r ) {
                out.printLine("NO");
                return;
            }

        }
        out.printLine("YES");
    }
}
