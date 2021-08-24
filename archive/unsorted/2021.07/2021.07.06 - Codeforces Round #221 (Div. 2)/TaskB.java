package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int[] given = new int[n], found = new int[n];
        for (int i = 0; i < m; i++) {
            int a = in.readInt(), b = in.readInt(), c = in.readInt();
            given[a-1]+=c;
            found[b-1]+=c;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(found[i]>given[i])
            sum+=(found[i]-given[i]);
        }
        out.printLine(sum);
    }

}
