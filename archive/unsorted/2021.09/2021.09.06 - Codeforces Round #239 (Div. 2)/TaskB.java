package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine(), t = in.readLine();
        int[] freqs = new int[26], freqt = new int[26];
        for (char c : s.toCharArray()) {
            freqs[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            freqt[c - 'a']++;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freqt[i] > 0 && freqs[i]==0){
                out.printLine(-1);
                return;
            }
            count+=Math.min(freqs[i],freqt[i]);
        }
        out.print(count);

    }
}
