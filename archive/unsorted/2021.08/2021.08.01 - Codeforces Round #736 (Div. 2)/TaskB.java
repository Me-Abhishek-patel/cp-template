package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        char[] enemy = ("0" + in.readLine() + "0").toCharArray();
        char[] greg = ("0" + in.readLine() + "0").toCharArray();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (greg[i] == '1') {
                if (enemy[i] == '0') {
                    count++;
                    continue;
                } else if (enemy[i - 1] == '1') {
                    count++;
                    continue;
                } else if (enemy[i + 1] == '1') {
                    count++;
                    enemy[i + 1] = '2';
                    continue;
                }
            }
        }
        out.printLine(count);
    }
}
