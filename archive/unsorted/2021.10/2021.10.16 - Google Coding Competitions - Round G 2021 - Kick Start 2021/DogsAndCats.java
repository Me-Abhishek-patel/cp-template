package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class DogsAndCats {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readInt(), d = in.readInt(), c = in.readInt(), m = in.readInt();
        String s = in.readLine();
        int b = (int) n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'C') {
                if (c >= 1) c--;
                else {
                    b = i;
                    break;
                }
            } else {
                if (d >= 1) {
                    d--;
                    c += m;
                } else {
                    b = i;
                    break;
                }
            }

        }
        while (b < n) {
            if (s.charAt(b) == 'D') {
                out.printLine("Case #" + testNumber + ": NO");
                return;
            }
            b++;
        }
        out.printLine("Case #" + testNumber + ": YES");
    }
}
