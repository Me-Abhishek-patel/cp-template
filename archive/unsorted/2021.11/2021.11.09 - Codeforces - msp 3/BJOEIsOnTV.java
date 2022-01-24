package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BJOEIsOnTV {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();

        double res = 0;
        for (int i = n; i >= 1; i--) {
            res += 1.0/i;
        }
        out.printLine(res);
    }
}
