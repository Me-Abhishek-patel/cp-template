package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class NewPiece {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int a = in.readInt(), b = in.readInt(), p = in.readInt(), q = in.readInt();
        if (a == p && b == q) {
            out.printLine(0);
            return;
        }
        if ((a + b) % 2 == (p + q )% 2) {
            out.printLine(2);
        } else out.printLine(1);

    }
}
