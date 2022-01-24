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

import FastIO.Scanner;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.io.IOException;

public class SummationOfPolynomials {
    public void solve(int testNumber, InputReader in, OutputWriter out) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.ready()) {
            long n = sc.nextLong();
            out.printLine((n * n * (n + 1) * (n + 1)) / 4);
        }
    }
}
