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

public class NewPassword {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        StringBuilder sb = new StringBuilder(in.readLine());
        boolean x = false, y = false, z = false, f = false;
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isUpperCase(sb.charAt(i)))
                x = true;
            if (Character.isLowerCase(sb.charAt(i)))
                y = true;
            if (Character.isDigit(sb.charAt(i)))
                z = true;
            if (sb.charAt(i) == '#' || sb.charAt(i) == '@' || sb.charAt(i) == '*' || sb.charAt(i) == '&')
                f = true;
        }
        if (!x) sb.append('A');
        if (!y) sb.append('a');
        if (!z) sb.append('1');
        if (!f) sb.append('*');
        while (sb.length() < 7) sb.append('a');
        out.printLine("Case #" + testNumber + ": " + sb.toString());
    }
}
