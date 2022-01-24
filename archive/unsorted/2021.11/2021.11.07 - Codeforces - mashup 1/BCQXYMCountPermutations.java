package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BCQXYMCountPermutations {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt()*2;
        long ans = n;
        long a =1;
        for (int i = 0; i < n-1; i++) {
            a = a*2;
        }
        out.printLine(ans+a);
    }
}
