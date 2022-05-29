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

public class MaximisingVacations {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), x = in.readInt();
        String s = in.readLine();


        ArrayList<Integer> al = new ArrayList<>();
        al.add(-1);
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                al.add(i);
            }
        }
        al.add(n);
        int res = 0, rem = 0, prevrem = 0;
        boolean used = false;

        for (int i = 1; i < al.size(); i++) {
            int zeros = al.get(i) - al.get(i - 1) - 1;
            res += zeros / x;
            rem = zeros % x;
            if (!used && prevrem + rem >= x - 1) {
                res++;
                used = true;
            }
            prevrem = rem;

        }
        out.printLine(res);

    }
}
