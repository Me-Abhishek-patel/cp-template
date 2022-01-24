package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BDreamoonAndWiFi {
    double total = 0, reached = 0;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        String t = in.readLine();
        int k = 0;
        for (char c : s.toCharArray()) {
            if (c == '+') k++;
            else k--;
        }
        total = 0;
        go(t, 0, 0, k);
        out.printLine(reached / total);
    }

    private void go(String t, int i, int cur, int k) {
        if (i == t.length()) {
            total++;
            if (cur == k) reached++;
            return;
        }
        if (t.charAt(i) == '+')
            go(t, i + 1, cur + 1, k);
        else if (t.charAt(i) == '-')
            go(t, i + 1, cur - 1, k);
        else {
            go(t, i + 1, cur + 1, k);
            go(t, i + 1, cur - 1, k);

        }


    }
}
