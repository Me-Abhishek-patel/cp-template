package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class DBlueRedPermutation {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        String s = in.readLine();
        int half = (int) Math.ceil((double) n / 2);
        int r = 0, b = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R' && a[i] > half) r++;
            if (s.charAt(i) == 'B' && a[i] <= half) b++;
        }
        if (r > (n - half) || b >half)out.printLine("NO");
        else out.printLine("YES");

    }
}
