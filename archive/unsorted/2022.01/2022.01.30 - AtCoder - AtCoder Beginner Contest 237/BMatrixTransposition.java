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
import net.cplibrary.numbers.Matrix;

import java.util.ArrayList;

public class BMatrixTransposition {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        long[][] mat = in.readLongTable(n, m);
        Matrix matrix = new Matrix(mat);
        matrix = matrix.rotateRight();
//        matrix = matrix.rotateRight();
//        matrix = matrix.rotateRight();
        matrix = matrix.reflect();
        for (long[] datum : matrix.data) {
            for (long l : datum) {
                out.print(l+" ");
            }
            out.printLine();
        }
    }
}
