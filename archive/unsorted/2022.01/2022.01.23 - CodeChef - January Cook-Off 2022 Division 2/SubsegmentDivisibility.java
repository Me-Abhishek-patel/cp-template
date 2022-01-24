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

public class SubsegmentDivisibility {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int temp = 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            //
            out.print(temp+" ");
            count++;
            temp++;
            if (count == 2) {
                count=0;
                temp+=2;
            }
        }
        out.printLine();
    }
}
