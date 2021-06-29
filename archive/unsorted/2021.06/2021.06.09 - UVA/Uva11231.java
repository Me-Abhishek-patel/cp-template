package codes;


import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class Uva11231 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt(), c = in.readInt();
        int ans;
        while (n!=0 && m!=0) {
            if (n < 8 || m < 8) ans = 0;
            else {
                int tmp = (n - 8 + 1) * (m - 8 + 1);
                ans = c == 0 ? tmp / 2 : (tmp + 1) / 2;
            }
            out.printLine(ans);
            n = in.readInt(); m = in.readInt(); c = in.readInt();
        }
    }
}
