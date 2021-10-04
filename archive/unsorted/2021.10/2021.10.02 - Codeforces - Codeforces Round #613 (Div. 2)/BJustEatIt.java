package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BJustEatIt {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        long lsum = 0, rsum = 0;
        for (int i = 0; i < n; i++) {
            lsum+=a[i];
            rsum+=a[n-i-1];
            if(lsum<=0 || rsum<=0){
                out.printLine("NO");
                return;
            }
        }
        out.printLine("YES");


    }
}
