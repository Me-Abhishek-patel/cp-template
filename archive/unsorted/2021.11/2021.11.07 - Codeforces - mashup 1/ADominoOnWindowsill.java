package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ADominoOnWindowsill {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k1 = in.readInt(), k2 = in.readInt();
        int w = in.readInt(), b = in.readInt();

        int ws = Math.max(k1 / 2 + k2 / 2, Math.min(k1, k2) + (Math.max(k1, k2) - Math.min(k1, k2)) / 2);
        k1 = n - k1;
        k2 = n - k2;
        int bs = Math.max(k1 / 2 + k2 / 2, Math.min(k1, k2) + (Math.max(k1, k2) - Math.min(k1, k2)) / 2);
        if (ws >= w && bs >= b) {
            out.printLine("YES");
        } else out.printLine("NO");
    }
}
