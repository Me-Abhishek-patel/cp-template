package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    static int computeXOR(int n) {
        if (n % 4 == 0)
            return n;
        if (n % 4 == 1)
            return 1;
        if (n % 4 == 2)
            return n + 1;
        return 0;
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.readInt(), b = in.readInt();
        int xor = a == 1 ? 0 : computeXOR(a - 1);
        int res = a;
        if (xor == b) {
            res = a;
        } else if (a == (xor^b)) {
            res += 2;
        } else res += 1;

        out.printLine(res);

    }
}
