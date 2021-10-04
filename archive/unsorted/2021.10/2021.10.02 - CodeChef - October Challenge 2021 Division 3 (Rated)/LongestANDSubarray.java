package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class LongestANDSubarray {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int t = n,cnt  =0;
        while (t>0){
            t= t>>1;
            cnt++;
        }
        int mask =(1 << cnt-1);
        if (mask == n) {
            out.printLine(n - (mask >> 1));
        } else {
            out.printLine(Math.max(n - mask + 1, mask - (mask >> 1)));
        }
    }
}
