package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    static boolean[] soe;
    String res = "";


    public static void sieve() {
        int maxN = 99;
        soe[0] = soe[1] = true;
        for (int i = 2; i * i <= maxN; i++) {
            if (!soe[i]) {
                for (int j = i * i; j <= maxN; j += i) {
                    soe[j] = true;
                }
            }
        }
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.readInt();
        soe = new boolean[100];
        sieve();

        while (t-- > 0) {
            int k = in.readInt();
            res = "000000";
            String s = in.readLine();
            go(s, "", 0);
            out.printLine(res.length());
            out.printLine(res);


        }

    }

    private void go(String s, String num, int start) {
        if (num.length() > 2) return;
        if (num.length() > 0) {
            if (num.length() < res.length()) {
                if (soe[Integer.parseInt(num)]) {
                    res = num;
                    return;
                }
            }
        }
        if (res.length() != 1) {
            for (int i = start; i < s.length(); i++) {
                go(s, num + s.charAt(i), i + 1);
            }
        }
    }

}
