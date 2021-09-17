package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        for (int i = 0; i < n - 1; i++) {
            int a = 0, b = 0;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == 'a') a++;
                else b++;
                if (a == b) {
                    out.printLine((i + 1) + " " + (j + 1));
                    return;
                }
            }
        }
        out.printLine(-1 + " " + -1);
    }
}
