package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = in.readIntArray(n);
        int x = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            x = (x & arr[i]);
        }
        out.printLine(x);
    }
}
