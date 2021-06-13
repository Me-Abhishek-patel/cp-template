package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readInt(), m = in.readInt(), a = in.readInt();
//        if(n<a ){
//
//        }
        long x = (int)(Math.ceil((double)n/a));
        x = x==0?1:x;
        long y = (int)(Math.ceil((double) m/a));
        y = y==0?1:y;
        out.printLine((long) x*y);
    }
}
