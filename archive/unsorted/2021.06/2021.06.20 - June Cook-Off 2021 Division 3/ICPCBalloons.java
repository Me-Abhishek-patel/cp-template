package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class ICPCBalloons {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = in.readIntArray(n);
        int i = 0;
        boolean[] check = new boolean[16];
        for (; i < n; i++) {
            check[arr[i]] = true;
            if (isCompleted(check)) break;
        }
        out.printLine(i+1);
    }

    private boolean isCompleted(boolean[] check) {
        for (int i = 1; i < 8; i++) {
            if (!check[i]) return false;
        }
        return true;

    }
}
