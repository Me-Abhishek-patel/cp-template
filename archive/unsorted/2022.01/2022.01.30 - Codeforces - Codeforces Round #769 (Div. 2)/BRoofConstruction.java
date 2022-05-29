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

public class BRoofConstruction {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int i = 0, j = Integer.highestOneBit(n - 1);
        int k = j;
        StringBuilder sb = new StringBuilder();
        int even = 1;
        while (j < n) {
            if (even % 2 != 0) {
                sb.append(i).append(" ").append(j).append(" ");
            } else {
                sb.append(j).append(" ").append(i).append(" ");
            }
            i++;
            j++;
            even++;
        }
        while (i < k) {
            out.print(i + " ");
            i++;
        }
        out.print(sb);
        out.printLine();

    }
}
