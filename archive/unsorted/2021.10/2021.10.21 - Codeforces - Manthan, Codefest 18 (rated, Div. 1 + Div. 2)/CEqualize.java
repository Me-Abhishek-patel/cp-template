package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CEqualize {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String a = in.readString(), b = in.readString();
//        int x = go(a, b, 0, 0);
        int x = 0;
        for (int i = 0; i < n; i++) {
            if(a.charAt(i)==b.charAt(i)) continue;
            else {
                if(i + 1 < a.length() && a.charAt(i + 1) != b.charAt(i + 1) && a.charAt(i) != a.charAt(i + 1)){
                    x++;
                    i++;
                }else{
                    x++;
                }
            }
        }
        out.printLine(x);
    }

    private int go(String a, String b, int i, int j) {
        if (i >= a.length()) return 0;

        if (a.charAt(i) == b.charAt(i))
            return go(a, b, i + 1, j);
        else {
            if (i + 1 < a.length() && a.charAt(i + 1) != b.charAt(i + 1) && a.charAt(i) != a.charAt(i + 1)) {
                return 1 + go(a, b, i + 2, j);
            } else {
                return 1 + go(a, b, i + 1, j);
            }
        }
    }
}
