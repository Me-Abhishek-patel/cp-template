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

import java.math.BigInteger;

public class CDreamoonAndSums {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long a = in.readInt(), b = in.readInt();
        BigInteger aa = new BigInteger(String.valueOf(a)), bb = new BigInteger(String.valueOf(b));
        BigInteger res1 = aa.multiply(aa.add(new BigInteger("1"))).divide(new BigInteger("2")).multiply(bb).add(aa);
        BigInteger res2 = bb.multiply(bb.subtract(new BigInteger("1"))).divide(new BigInteger("2"));
        out.printLine(res1.multiply(res2).mod(new BigInteger(String.valueOf(MOD7))).longValue());
    }
}
