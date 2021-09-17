package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        if (k > Math.ceil((float) (n * n) / 2)) {
            out.printLine("NO");
        } else {
            out.printLine("YES");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (k > 0 && (i + j) % 2 == 0) {
                        out.print('L');
                        k--;
                    }
                    else out.print('S');
                }
                out.printLine();
            }
        }
    }
}
