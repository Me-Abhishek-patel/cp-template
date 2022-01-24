package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String n = in.readString();
        int ans = Integer.parseInt(n.replaceAll("4", "0").replaceAll("7", "1"), 2);
        ans += (1 << n.length());
        out.printLine(ans -1);
    }
}
