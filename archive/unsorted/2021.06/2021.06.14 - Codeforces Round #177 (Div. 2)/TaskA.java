package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int x = in.readInt(), y = in.readInt();
            sum += (y - x + 1);

        }
        long l = (sum % k);
        if(l==0)out.printLine(0);
        else
        out.printLine((k - l));
    }
}
