package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int[] b = in.readIntArray(n - 1);
        int[] c = in.readIntArray(n - 2);
        int x = 0, y = 0,z=0;
        for (int i = 0; i < n ; i++) {
            x += a[i];
            if(i<n-1)
                y+=b[i];
            if(i<n-2)
                z+=c[i];
        }

        out.printLine(x-y);
        out.printLine(y-z);
    }
}
