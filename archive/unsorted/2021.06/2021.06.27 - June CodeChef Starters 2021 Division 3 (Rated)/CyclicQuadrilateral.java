package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class CyclicQuadrilateral {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int a = in.readInt(),b = in.readInt(),c = in.readInt(),d = in.readInt();
        if(a+c==180 && b+d==180)out.printLine("YES");
        else out.printLine("NO");
    }
}
