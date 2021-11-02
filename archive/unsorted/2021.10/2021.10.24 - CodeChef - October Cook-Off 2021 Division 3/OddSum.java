package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class OddSum {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readInt();
        long sum = 1;
        if(n<=2){
            out.printLine(1);
            return;
        }
        n -= 2;
        out.printLine(n*(n+1)+1);

    }
}
