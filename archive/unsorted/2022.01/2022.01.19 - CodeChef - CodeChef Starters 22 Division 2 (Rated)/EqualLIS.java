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

public class EqualLIS {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        if(n==2){
            out.printLine("NO");
            return;
        }
        if (n % 2 == 0) {
            out.printLine("YES");
            int i = 2, j = n;
            while (i != j) {
                out.print(i + " " + j + " ");
                j--;
                i++;
            }
            out.print(1 + " " + j);
        } else {
            out.printLine("YES");
            int i = 1, j = n;
            while (i <= j) {
                if (i == j) {
                    out.print(i);
                    break;
                } else {
                    out.print(i + " " + j + " ");
                }
                j--;
                i++;
            }
        }
        out.printLine();
    }
}
