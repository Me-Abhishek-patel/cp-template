package codes;

import static java.lang.Math.*;
import static java.lang.String.*;
import static net.cplibrary.numbers.IntegerUtils.MAX_VALUE;
import static net.cplibrary.numbers.IntegerUtils.MIN_VALUE;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Stack;

public class CBracketSequenceDeletion {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        int i = 0, j = 0;
        Stack<Character> st = new Stack<>();
        int op = 0;
        while (i < n && j < n) {
            if (s.charAt(j) == '(') {
                st.push(s.charAt(j));
            } else {
                if (!st.isEmpty())
                    st.pop();
                else st.push(s.charAt(j));
            }
            if (j - i >= 1 && (isPalindrome(s, i, j) || st.isEmpty())) {
                i = j + 1;
                j = i;
                op++;
                st.clear();
                continue;
            }
            j++;
        }
        out.printLine(op + " " + (n - i));

    }

    private boolean isPalindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
