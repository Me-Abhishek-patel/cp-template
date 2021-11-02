package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CVladikAndFractions {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readInt();
        if (n == 1) out.printLine(-1);
        else out.printLine(n + " " +( n + 1) + " " +( n * (n + 1)));
    }
}
