package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readString();
        String k = in.readString();
        int a = s.indexOf('|');
        int b = s.length() - a - 1;
        int diff = Math.abs(a - b);
        int c = k.length();

        if (c < diff || (c - diff) % 2 != 0) {
            out.printLine("Impossible");
            return;
        }
        int half = (c - diff) / 2;
        int l = diff + half;
        if (a < b) {
            out.print(k.substring(0, l) +s+ k.substring(l));
        }else {
            out.printLine( k.substring(l)+s+ k.substring(0, l));
        }


    }
}
