package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();

        if (s.length() < 26) {
            System.out.println(-1);
            return;
        }


        for (int i = 0; i + 25 < s.length(); i++) {
            int[] freq = new int[26];
            String t = s.substring(i, i+26);
            for (char c : t.toCharArray()) {
                if (c != '?') {
                    freq[c - 'A']++;
                }
            }
            if (checkfreq(freq)) {

                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < i; j++) {
                    if(s.charAt(j)=='?')sb.append('A');
                    else sb.append(s.charAt(j));
                }
                sb.append(buildOutput(out, t, freq));
                for (int j = i + 26; j < s.length(); j++) {
                    if(s.charAt(j)=='?')sb.append('A');
                    else sb.append(s.charAt(j));
                }
                out.printLine(sb);
                return;
            }
        }
        out.printLine(-1);


    }

    private boolean checkfreq(int[] freq) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 1) return false;
        }
        return true;
    }

    private String buildOutput(OutputWriter out, String s, int[] freq) {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            while (k < 26 && freq[k] != 0) k++;
            if (s.charAt(i) != '?') sb.append(s.charAt(i));
            else {
                sb.append((char) (k + 'A'));
                k++;
            }
        }
        return sb.toString();
    }
}
