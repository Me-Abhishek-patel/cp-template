package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.string.StringUtils;

public class CAnagramSearch {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readString();
        String p = in.readString();
        if (p.length() > s.length()) {
            out.printLine(0);
            return;
        }
        int n = p.length();
        int[] pFreq = StringUtils.freqArray(p);
        int[] sfreq = new int[26];
        int qcount = 0;
        for (int i = 0; i < p.length(); i++) {
            if (s.charAt(i) != '?') {
                sfreq[s.charAt(i) - 'a']++;
            } else qcount++;
        }
        int res = 0;
        for (int i = n; i <= s.length(); i++) {
            if (check(pFreq, sfreq, qcount)) res++;
            if(i<s.length()){
                if (s.charAt(i) != '?') {
                    sfreq[s.charAt(i) - 'a']++;
                } else qcount++;
                if (s.charAt(i - n) != '?') {
                    sfreq[s.charAt(i - n) - 'a']--;
                } else qcount--;
            }
        }
        out.printLine(res);
    }

    private boolean check(int[] pFreq, int[] sfreq, int qcount) {
        int diff = 0;
        for (int i = 0; i < 26; i++) {
            diff += Math.abs(pFreq[i] - sfreq[i]);
        }
        return diff == qcount;
    }
}
