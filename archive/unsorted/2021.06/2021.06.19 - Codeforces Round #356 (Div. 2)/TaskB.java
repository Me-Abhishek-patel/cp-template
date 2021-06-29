package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), a = in.readInt();
        int[] t = in.readIntArray(n);
        int x = a - 1, y = a - 1;
        int count = 0;
        while (x >= 0 && y <= n - 1) {
            if (t[x] == 1 && t[y] == 1) {
                if(x==y) count++;
                else
                count += 2;

            }
            x--;
            y++;
        }
        while (x >= 0) if (t[x--] == 1) count++;
        while (y < n) if (t[y++] == 1) count++;
        out.printLine(count);

    }
}
