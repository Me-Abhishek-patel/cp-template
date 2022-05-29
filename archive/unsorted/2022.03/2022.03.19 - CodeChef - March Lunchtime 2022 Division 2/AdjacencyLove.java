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
import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyLove {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        Queue<Integer> even = new LinkedList<>(), odd = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int x = in.readInt();
            if (x % 2 == 0) even.add(x);
            else odd.add(x);
        }
        if (odd.size() < 2) {
            out.printLine(-1);
            return;
        }
        ArrayList<Integer> al = new ArrayList<>();
        al.add(odd.poll());
        al.add(odd.poll());
        if (odd.size() % 2 != 0) {
            if (even.size() == 0) {
                out.printLine(-1);
                return;
            } else {
                while (!even.isEmpty()) al.add(even.poll());
                while (!odd.isEmpty()) al.add(odd.poll());
            }
        } else {
            while (!odd.isEmpty()) al.add(odd.poll());
            while (!even.isEmpty()) al.add(even.poll());

        }
        for (Integer i : al) {
            out.print(i+" ");
        }
        out.printLine();

    }
}
