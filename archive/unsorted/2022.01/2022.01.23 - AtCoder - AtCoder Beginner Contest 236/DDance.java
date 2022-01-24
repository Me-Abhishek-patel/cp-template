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

import java.util.ArrayList;
import java.util.HashSet;

public class DDance {
    static long res = 0;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        ArrayList<ArrayList<Long>> al = new ArrayList<>();
        for (int i = 0; i < 2 * n - 1; i++) {
            al.add(new ArrayList<>());
            for (int j = 0; j < 2 * n - 1 - i; j++) {
                al.get(i).add(in.readLong());
            }
        }
//        for (ArrayList<Integer> integers : al) {
//            for (Integer integer : integers) {
//                out.print(integer+" ");
//            }
//            out.printLine();
//        }

        go(al, 0, 0, new HashSet<>());
        out.printLine(res);

    }


    private void go(ArrayList<ArrayList<Long>> al, long xor, int j, HashSet<Integer> hs) {
//        if (i > al.size() || j > al.get(i).size()) return 0;

        res = max(xor, res);
        for (int i1 = 0; i1 < al.size(); i1++) {
            if (!hs.contains(i1)) {
                hs.add(i1);
                for (int i2 = 0; i2 < al.get(i1).size(); i2++) {
                    if (!hs.contains(i2 + i1 + 1)) {
                        hs.add(i2 + i1 + 1);
                        go(al, xor ^ (al.get(i1).get(i2)), j, hs);
                        hs.remove(i2 + i1 + 1);
                    }
                }
                hs.remove(i1);
            }
        }

    }
}
