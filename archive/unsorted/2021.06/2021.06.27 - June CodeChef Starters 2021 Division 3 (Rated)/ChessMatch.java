package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class ChessMatch {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), a = in.readInt(), b = in.readInt();
        int total = 2*(180+n);
        out.printLine(total-(a+b));
    }
}
