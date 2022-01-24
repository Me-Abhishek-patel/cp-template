package codes;

import static java.lang.Math.*;
import static net.cplibrary.misc.ArrayUtils.*;
import static net.cplibrary.numbers.IntegerUtils.*;
import static net.cplibrary.string.StringUtils.*;
import static net.cplibrary.misc.MiscUtils.*;
import static net.cplibrary.collections.CollectionUtils.*;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class CKnightTournament {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int[] a = new int[n];
        TreeSet<Integer> alive = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            alive.add(i);
        }
        for (int i = 0; i < m; i++) {
            int l = in.readInt() - 1, r = in.readInt() - 1, x = in.readInt();
            ArrayList<Integer> toErase = new ArrayList<>();

            for (Integer cur : alive.subSet(l, r + 1)) {
                if (cur+1 != x) {
                    toErase.add(cur);
                    a[cur] = x;
                }
            }
            for (Integer it : toErase) {
                alive.remove(it);
            }
        }
        out.printLine(a);
    }
}
