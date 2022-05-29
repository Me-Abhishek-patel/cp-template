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

import net.cplibrary.geometry.Point;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;


public class AIntegerMoves {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        Point p = new Point(0, 0);
        Point q = Point.readPoint(in);
        if (p.equals(q)) {
            out.printLine(0);
        } else {
            double d = p.distance(q);
            if (((int) d) == d) {
               out.printLine(1);
            }else out.printLine(2);
        }
    }
}
