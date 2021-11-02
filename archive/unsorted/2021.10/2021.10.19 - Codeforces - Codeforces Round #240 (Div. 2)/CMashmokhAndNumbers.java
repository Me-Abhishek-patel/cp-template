package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CMashmokhAndNumbers {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        if (n == 1 && k == 0) {
            out.printLine(1);
            return;
        }
        if (n / 2 > k || n == 1 && k != 2) {
            out.printLine(-1);
            return;
        }

        int x = n / 2 - 1;
        out.print((k - x) + " " + (2 * (k - x)));
        for (int i = 1; i <= n - 2; i++) {
            out.print(" " + (2 * (k - x) + i));
        }
        out.printLine();

    }
}
