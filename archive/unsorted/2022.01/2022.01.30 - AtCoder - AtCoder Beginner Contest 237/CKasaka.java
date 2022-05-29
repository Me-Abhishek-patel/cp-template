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

public class CKasaka {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        int i = 0, j = s.length() - 1;
        while (i < s.length() && s.charAt(i) == 'a') i++;
        while (j >= 0 && s.charAt(j) == 'a') j--;
        if (i > s.length() - 1 - j) {
            out.printLine("No");
            return;
        } else {
            boolean  b = isPalindrome(s, i, j);
            out.printLine(b?"Yes":"No");
        }


    }

    public static boolean isPalindrome(String str, int i, int j) {
        for (; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) return false;
        }
        return true;
    }
}
