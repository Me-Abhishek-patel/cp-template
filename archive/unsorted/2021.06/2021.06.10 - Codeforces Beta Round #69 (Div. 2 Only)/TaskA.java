package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long l = in.readLong();
        long r = in.readLong();
        if(l%2!=0)l++;
        long c = l + 2;
        if (c > r) out.printLine(-1);
        else out.printLine(l + " " + (l + 1) + " " + c);
    }
}
