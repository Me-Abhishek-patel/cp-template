package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CDisposition {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        for (int i = 0; i < n-1; i++) {
            out.print((i + 2) + " ");
        }
        out.printLine(1);
    }
}
