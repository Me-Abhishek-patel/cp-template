package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ChefAndPairingSlippers {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), l = in.readInt(), x = in.readInt();
        out.printLine(Math.min(l,n-l)*x);
    }
}
