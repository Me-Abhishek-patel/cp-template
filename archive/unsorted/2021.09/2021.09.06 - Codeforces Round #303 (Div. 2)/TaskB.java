package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine(), t = in.readLine();
        int d = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) d++;
        }
        if (d % 2 != 0) {
            out.printLine("impossible");
            return;
        }
        StringBuilder sb = new StringBuilder();
        d/=2;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i) && d > 0) {
                if (s.charAt(i) == '0') sb.append('1');
                else sb.append('0');
                d--;
            } else {
                sb.append(s.charAt(i));
            }
        }
        out.printLine(sb);
    }
}
