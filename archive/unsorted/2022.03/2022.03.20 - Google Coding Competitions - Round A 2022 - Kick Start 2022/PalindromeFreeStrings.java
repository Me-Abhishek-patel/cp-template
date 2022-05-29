package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class PalindromeFreeStrings {
    boolean isPossible = false;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        go(s, "", 0, out);
        if (isPossible)
            out.printLine("Case #" + testNumber + ": POSSIBLE");
        else
            out.printLine("Case #" + testNumber + ": IMPOSSIBLE");
    }

    private void go(String s, String cur, int i, OutputWriter out) {

        if (i >= s.length()) {
            int n = cur.length();
            for (int l = 0; l < n; l++) {
                for (int j = l + 4; j < n; j++) {
                    if (isPalindrome(cur, l, j)) {
                        return;
                    }
                }
            }
            out.printLine(cur.length());
            out.printLine(cur);
            isPossible = true;
            return;
        }
        if (!isPossible) {
            if (s.charAt(i) != '?') {
                go(s, cur + s.charAt(i), i + 1, out);
            } else {
                go(s, cur + "0", i + 1, out);
                go(s, cur + "1", i + 1, out);
            }
        }
    }

    public static boolean isPalindrome(String str, int i, int j) {
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}
