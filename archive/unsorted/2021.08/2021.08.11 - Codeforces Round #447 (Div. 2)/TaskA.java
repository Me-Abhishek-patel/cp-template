package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        out.printLine(go(s, "", 0));
    }

    private int go(String s, String out, int i) {
        if (i == s.length()) {
            return out.equals("QAQ") ? 1 : 0;
        } else if (out.length() > 3) return 0;
        return go(s, out + s.charAt(i), i + 1) + go(s, out, i + 1);
    }
}
