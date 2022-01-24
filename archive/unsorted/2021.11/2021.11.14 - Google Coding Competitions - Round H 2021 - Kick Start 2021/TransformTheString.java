package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class TransformTheString {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine(), f = in.readLine();
        int[] mind = new int[26];
        Arrays.fill(mind, 100);
        for (int i = 0; i < 26; i++) {
            for (char c : f.toCharArray()) {
                mind[i] = Math.min(mind[i],
                        Math.min(Math.abs(i - (c - 'a')),
                                26 - Math.abs(i - (c - 'a'))));
            }

        }
        long res = 0;
        for (char c : s.toCharArray()) {
            res += mind[c - 'a'];
        }
        out.printLine("Case #" + testNumber + ": " + res);
    }
}
