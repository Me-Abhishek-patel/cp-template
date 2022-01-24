package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class RomanticReversals {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        String s = in.readLine();
        StringBuilder sb = new StringBuilder();
        int i = 0, j = k - 1;
        while (i <= j) {
            if (i == j) {
                sb.append(s.charAt(i));
                break;
            } else {
                sb.append(s.charAt(i)).append(s.charAt(j));

            }
            i++;
            j--;
        }
        out.print((sb.reverse().toString()));
        if (k < n){
            out.print(s.substring(k));
        }
        out.printLine();

    }
}
