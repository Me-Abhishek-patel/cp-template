package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int i = 1, j = n;
        boolean x = true;

        while (i <= j) {
            out.print(x ? (i++) + " " : (j--) + " ");
            k--;
            if (k > 0) {

                x = !x;
            }
        }
    }
}
