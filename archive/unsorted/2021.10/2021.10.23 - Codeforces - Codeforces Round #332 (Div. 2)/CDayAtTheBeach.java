package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CDayAtTheBeach {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[]h = new int[n];
        for (int i = 0; i < n; ++i) h[i] = in.readInt();

        int[]max = new int[n];
        max[0] = h[0];
        for (int i = 1; i < n; ++i) max[i] = Math.max(h[i], max[i - 1]);

        int[]min = new int[n + 1];
        min[n] = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; --i) min[i] = Math.min(h[i], min[i + 1]);

        int b = 0;
        for (int i = 0; i < n; ++i)
            if (min[i + 1] >= max[i]) ++b;

        out.printLine(b);
    }
}
