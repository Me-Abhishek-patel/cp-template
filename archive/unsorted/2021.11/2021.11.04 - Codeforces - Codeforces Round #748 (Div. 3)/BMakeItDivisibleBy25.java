package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;

public class BMakeItDivisibleBy25 {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        HashMap<String, Integer> dp = new HashMap<>();
        String[] t = {"00", "25", "50", "75"};
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            ans = Math.min(go(s, t[i], dp, s.length() - 1, 1), ans);
        }
        out.printLine(ans);

    }

    private int go(String s, String t, HashMap<String, Integer> dp, int i, int j) {
        if (j == -1) return 0;
        if (i == -1) return Integer.MAX_VALUE - 10000;
        if (s.charAt(i) == t.charAt(j)) {
            return go(s, t, dp, i - 1, j - 1);
        } else {
            return 1 + (go(s, t, dp, i - 1, j));
        }

    }
}
