package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;

public class BTheChildAndSet {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int sum = in.readInt(), limit = in.readInt();
        HashSet<Integer> hs = new HashSet<>();
        int x = limit;
        if (limit % 2 != 0)
            x--;
        while (x > 1 && sum - Integer.lowestOneBit(x) >= 0) {
            sum -= Integer.lowestOneBit(x);
            hs.add(x);
            x -= 2;
        }
        x = 1;

        while (sum != 0 && x <= limit) {
            sum -= 1;
            hs.add(x);
            x += 2;
        }
        if (sum == 0) {
            out.printLine(hs.size());
            for (Integer h : hs) {
                out.print(h+" ");
            }
            out.printLine();
        } else {
            out.printLine(-1);
        }

    }
}
