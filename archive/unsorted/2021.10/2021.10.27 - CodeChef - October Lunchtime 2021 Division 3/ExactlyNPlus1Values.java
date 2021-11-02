package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ExactlyNPlus1Values {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long mask = 1;
        out.print(1);
        for (int i = 0; i < n; i++) {
            out.print(" "+(mask<<i));
        }
        out.printLine();

    }
}
