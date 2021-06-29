package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String k  =in.readString();
        StringBuilder s =  new StringBuilder(k);
        out.printLine(k+s.reverse().toString());
    }
}
