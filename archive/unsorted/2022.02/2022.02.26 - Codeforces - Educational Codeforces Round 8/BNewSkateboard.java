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

public class BNewSkateboard {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Integer.parseInt(s.charAt(i) + "") % 4 == 0) count++;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (Integer.parseInt(""+s.charAt(i)+""+s.charAt(i+1))%4==0){
                count+=(i+1);
            }
        }
        out.printLine(count);
    }
}
