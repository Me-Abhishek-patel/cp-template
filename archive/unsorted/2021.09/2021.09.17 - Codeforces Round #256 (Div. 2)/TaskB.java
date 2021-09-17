package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine(), t = in.readLine();
        int[] sfreq = new int[26], tfreq = new int[26];
        for (char c : s.toCharArray()) {
            sfreq[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            tfreq[c - 'a']++;
        }
        boolean equal = true, auto = true;
        for (int i = 0; i < 26; i++) {
            if (tfreq[i] > sfreq[i]) {
                out.printLine("need tree");
                return;
            }
            if (tfreq[i] != sfreq[i]) equal = false;

        }
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;

            }
            i++;
        }
        if (s.contains(t) || j == t.length()) {
            out.printLine("automaton");
            return;
        }
        if (equal) {
            out.printLine("array");
            return;
        } else out.printLine("both");

    }
}
