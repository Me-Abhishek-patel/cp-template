package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ASilentClassroom {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            freq[in.readLine().charAt(0) - 'a']++;
        }
        long res = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 1) {
                int x = freq[i] / 2;
                res += ((long) x * (x - 1)) / 2;
                x = freq[i] - x;
                res += ((long) x * (x - 1)) / 2;
            }
        }
        out.printLine(res);
    }
}
