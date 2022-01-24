package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BValeraAndContest {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt(), l = in.readInt(), r = in.readInt(), sall = in.readInt(), sk = in.readInt();
        int[] a = new int[n];
        int rrem = 0;
        if (k != 0) {
            rrem = sk % k;
            for (int i = 0; i < k; i++) {
                if (rrem-- > 0) a[i] = sk / k + 1;
                else a[i] = sk / k;
            }
        }
        int t = k;
        k = n - k;
        sk = sall - sk;
        if(k!=0) {
            rrem = sk % k;
            for (int i = 0; i < k; i++) {
                if (rrem-- > 0) a[i + t] = sk / k + 1;
                else a[i + t] = sk / k;
            }
        }
        out.printLine(a);
    }
}
