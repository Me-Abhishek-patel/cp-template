package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String S = in.readLine();
        int x = S.length() - 1, count = 0;
        int lastOne = S.lastIndexOf('1');
        int answer=0;
        if (lastOne == 0) {
            answer = S.length() - 1;
        } else {
            int zeros = 0;
            for (int i = 1; i < lastOne; i++) {
                if (S.charAt(i) == '0') {
                    zeros++;
                }
            }
            answer = zeros + 1 + S.length();
        }
        out.printLine(answer);

    }
}
