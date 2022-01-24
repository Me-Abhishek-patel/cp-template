package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;

public class BJzzhuAndSequences {
    static int x, y;
    static int mod = 1000000007;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        x = in.readInt();
        y = in.readInt();
        long n = in.readLong();
        long v[] = {x, y, y - x, -1 * x, -1 * y, x - y};
        n--;
        long M = 1000000007;
        out.printLine(((v[(int) n % 6] % M) + M) % M);
    }


}
