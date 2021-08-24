package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        int m = in.readInt();
        int[] arr = new int[s.length()];
        arr[s.length() - 1] = 0;
        int count = 0;
        for (int i = s.length() - 2; i >= 0; i--) {
            if (s.charAt(i) == s.charAt(i + 1))
                count++;
            arr[i] = count;
        }
        for (int i = 0; i < m; i++) {
            int l = in.readInt(), r = in.readInt();
            out.printLine(arr[l-1]-arr[r-1]);
        }
    }
}
