package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CBoredom {

    int n;
    HashMap<Integer, Long> dp = new HashMap<Integer, Long>();
    HashMap<Integer, Integer> freq = new HashMap<>();
    ArrayList<Integer> al;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        n = in.readInt();
        dp.clear();
        freq.clear();

        for (int j = 0; j < n; j++) {
            int i = in.readInt();
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        al = new ArrayList<>(freq.keySet());
        Collections.sort(al);
        n = al.size();
        long s = go(0);
        out.printLine(s);
    }

    private long go(int i) {
        if (i >= n) return 0;

        long res = Integer.MIN_VALUE;

        if (dp.containsKey(i)) return dp.get(i);

//        if (al.get(i) == prev + 1)
//            res = go(i + 1, prev);
//        else {
        if (i + 1 < n && al.get(i) + 1 == al.get(i + 1))
            res = Math.max(go(i + 1), (long) al.get(i) * freq.get(al.get(i)) + go(i + 2));
        else res = (long) al.get(i) * freq.get(al.get(i)) + go(i + 1);
//        }

        dp.put(i, res);
        return res;

    }
}
