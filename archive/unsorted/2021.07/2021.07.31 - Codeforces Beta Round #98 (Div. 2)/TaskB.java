package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int x = in.readInt();
            if(x<=n)
            arr[x]++;
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(arr[i]==0)count++;
        }
        out.printLine(count);

    }
}
