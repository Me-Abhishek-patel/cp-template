package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class DBachgoldProblem {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        out.printLine(n / 2);
        int k = n/2-1;
        out.printLine(n % 2 == 0 ? "2"+" 2".repeat(k) :3+" 2".repeat(k));

    }
}
