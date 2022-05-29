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
import org.apache.commons.lang3.StringUtils;

public class AMarinAndPhotoshoot {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        int c1 = 0, c2 = 0;
        for (int i = 0; i < n-1; i++) {
            if(s.charAt(i)=='0' && s.charAt(i+1)=='0')c1++;
        }
        for (int i = 0; i < n-2; i++) {
            if(s.charAt(i)=='0' && s.charAt(i+1)=='1' && s.charAt(i+2)=='0')c2++;
        }
//        out.printLine(c1+" "+c2);
        out.printLine(c2+(c1*2));
    }
}
