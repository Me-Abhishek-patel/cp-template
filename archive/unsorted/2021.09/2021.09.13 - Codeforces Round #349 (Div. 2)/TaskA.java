package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        double d = in.readInt(), h = in.readInt(), v = in.readInt(), e = in.readInt();
        double r = d / 2.0;
        double area = Math.PI * r * r;
        double a = area * h;
        double diff = (area * e) - v;
        if (diff >= 0) {
            out.printLine("NO");
            return;
        }
        double n = (a / -diff);
        out.printLine("YES");
        out.printLine(n);

    }
}
