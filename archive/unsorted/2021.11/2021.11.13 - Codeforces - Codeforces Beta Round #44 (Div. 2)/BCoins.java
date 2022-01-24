package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BCoins {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String[] s = in.readStringArray(3);
        int[] f = new int[3];
        for (String s1 : s) {
            if (s1.charAt(1) == '>') {
                f[s1.charAt(0) - 'A']++;
            } else {
                f[s1.charAt(2) - 'A']++;
            }
        }
        if (f[0] == f[1] ||f[0]==f[2]||f[1]==f[2]){
            out.printLine("Impossible");
            return;
        }
            char[] res = new char[3];
        for (int i = 0; i < 3; i++) {
            res[f[i]] = (char) (i + 'A');
        }
        out.printLine(res);

    }
}
