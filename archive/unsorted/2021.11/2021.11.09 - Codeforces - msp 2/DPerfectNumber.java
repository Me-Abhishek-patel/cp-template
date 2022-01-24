package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class DPerfectNumber {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int k = in.readInt();
        int ans = 18;
        while (k > 0) {
            ans++;
            if (digitSum(ans) == 10)k--;


        }
        out.printLine(ans);
    }

    private int digitSum(int ans) {
        int res = 0;
        while (ans != 0) {
            res += ans % 10;
            ans /= 10;
        }
        return res;
    }
}
