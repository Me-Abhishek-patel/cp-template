package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CTennisChampionship {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readLong();
        int count = 0;
        long prev = 0, current = 1;
        while (n >= current) {
            long t = prev + current;
            prev = current;
            current = t;
            count++;

        }
        out.printLine(count - 2);


    }
}
