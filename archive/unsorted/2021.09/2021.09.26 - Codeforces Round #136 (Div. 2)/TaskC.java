package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int[] b = a.clone();
        Arrays.sort(b);
        int cout = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                cout++;
            }
        }
        out.printLine(cout > 2 ? "NO" : "YES");

    }
}
