package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BalancedReversals {
    public void solve(int testNumber, InputReader sc, OutputWriter out) {

        int n = sc.readInt();
        String s = sc.readLine();
        int count0 = 0, count1 = 0;
        go(out, n, s, count0, count1);
    }

    private void go(OutputWriter out, int n, String str, int count0, int count1) {
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '0') count0++;
            else count1++;
        }
        for (int i = 0; i < count0; i++) {
            out.print(0);
        }
        for (int i = 0; i < count1; i++) {
            out.print(1);
        }
        out.printLine();
    }
}