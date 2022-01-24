package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class BLastYearsSubstring {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readString();
        if (s.indexOf("2020") == 0 || s.lastIndexOf("2020") == n - 4) {
            out.printLine("YES");
            return;
        }
        if (s.charAt(0) == '2') {
            if (s.substring(n - 3).equals("020") || (s.charAt(1) == '0' && s.substring(n - 2).equals("20")) || (s.substring(0, 3).equals("202") && s.charAt(n - 1) == '0')) {
                out.printLine("YES");
                return;
            }
        }
        out.printLine("NO");
    }
}
