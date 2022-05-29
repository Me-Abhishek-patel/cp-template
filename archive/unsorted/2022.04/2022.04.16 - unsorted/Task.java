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

public class Task {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long x = in.readLong();
        long[] a = in.readLongArray(120);
        long sell = in.readLong();
        long invest = 0, count = 0;
        double res = 0.0;
        int month = 120;
        for (long cost : a) {
            invest = 0;
            double t = (month / 12.0) + (month % 12.0) / 12.0;
            if (cost >= x) {
                invest += cost;
                double profit = cost * sell - cost;
                res += (profit * 100.0) / (invest * t);
                count++;

            } else {
                long ceil = (long) Math.ceil((double) x / cost), floor = (long) Math.floor((double) x / cost);
                if (abs(ceil * cost - x) < abs(floor * cost - x)) {
                    invest += ceil * cost;
                    double profit = ceil * sell - ceil * cost;
                    res += (profit * 100.0) / (invest * t);
                    count += ceil;
                } else {
                    invest += floor * cost;

                    double profit = floor * sell - floor * cost;
                    res += (profit * 100.0) / (invest * t);
                    count += floor;
                }
            }

        }
        out.printLine((sell * count - invest));


    }
}
