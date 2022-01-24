package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BBinaryRemovals {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readString();
        int x = s.indexOf("11"), y = s.lastIndexOf("00");
        if (x < 0 || y < 0) out.printLine("YES");
        else {
            out.printLine(x < y ?"NO":"YES");
        }
    }
}
