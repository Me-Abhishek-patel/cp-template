package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ALongComparison {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int x1 = in.readInt(), p1 = in.readInt();
        int x2 = in.readInt(), p2 = in.readInt();
        int digit1 = String.valueOf(x1).length();
        int digit2 = String.valueOf(x2).length();
        if (digit1 + p1 < digit2 + p2) {
            out.printLine("<");
        } else if (digit1 + p1 > digit2 + p2) {
            out.printLine(">");
        } else {
            if (digit1 < digit2) {
                x1 = Integer.parseInt(String.valueOf(x1 + "0".repeat(digit2 - digit1)));
            }
            if (digit2 < digit1) {
                x2 = Integer.parseInt(String.valueOf(x2 + "0".repeat(digit1 - digit2)));
            }
            if (x1 < x2) {
                out.printLine("<");
            } else if (x2 < x1) {
                out.printLine(">");
            }else {
                out.printLine("=");
            }
        }
    }
}
