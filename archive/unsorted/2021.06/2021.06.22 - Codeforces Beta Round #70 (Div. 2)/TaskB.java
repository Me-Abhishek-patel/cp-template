package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        final String S = "ROYGBIV";

        int n = in.readInt()-7;
        StringBuilder sb = new StringBuilder(S);
        for (int i = 0; i < n/4; i++) {
            sb.append(S.substring(3));
        }
        if(n%4!=0)sb.append(S, 3, 3+n%4);
        out.print(sb.toString());


    }
}
