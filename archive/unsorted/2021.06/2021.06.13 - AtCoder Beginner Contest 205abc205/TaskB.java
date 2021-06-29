package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long a = in.readLong();
        long b = in.readLong();
        long c = in.readLong();
        if (c % 2 == 0) {
            a = Math.abs(a);
            b = Math.abs(b);
        }
        char ch = '=';
        if (a < b) ch = '<';
        else if (a > b) ch = '>';
        out.printLine(ch);
    }
}
