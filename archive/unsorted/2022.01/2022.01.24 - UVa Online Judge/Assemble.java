package codes;

import net.cplibrary.collections.Pair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

import java.util.*;

public class Assemble {
    long b;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        b = in.readLong();

        HashMap<String, ArrayList<Pair<Long, Long>>> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] c = in.readLine().split(" ");
            ArrayList<Pair<Long, Long>> al = hm.getOrDefault(c[0], new ArrayList<>());
            al.add(new Pair<>(Long.parseLong(c[3]), Long.parseLong(c[2])));
            hm.put(c[0], al);
        }
        //clean
        long mx = Long.MAX_VALUE;
        ArrayList<ArrayList<Pair<Long, Long>>> g = new ArrayList<>();
        for (Map.Entry<String, ArrayList<Pair<Long, Long>>> entry : hm.entrySet()) {
            Collections.sort(entry.getValue(), (x, y) -> {
                long z = x.first - y.first;
                if (z == 0) return x.second - y.second == 0 ? 0 : (x.second > y.second ? 1 : -1);
                else return z > 0 ? 1 : -1;
            });
            mx = Math.min(mx, entry.getValue().get(entry.getValue().size() - 1).first);
            ArrayList<Pair<Long, Long>> al = new ArrayList<>();
            Stack<Pair<Long,Long>> st = new Stack<>();
            long mn = Long.MAX_VALUE;
            for (int i = entry.getValue().size() - 1; i >= 0; i--) {
                if (mn > entry.getValue().get(i).second) {
                    st.push(entry.getValue().get(i));
                    mn = entry.getValue().get(i).second;
                }
            }
            while (!st.isEmpty()) al.add(st.pop());
            g.add(al);
        }
        long res = bs(0, mx, g);
        out.printLine(res);


    }

    private long bs(long a, long b, ArrayList<ArrayList<Pair<Long, Long>>> g) {
        while (b - a > 1) {
            long m = (a + b) / 2L;
            if (!f(m, g)) {
                b = m;
            } else {
                a = m;
            }
        }
        if (f(b, g)) return b;
        return a;
    }

    private boolean f(long v, ArrayList<ArrayList<Pair<Long, Long>>> g) {
        long s = 0;
        for (ArrayList<Pair<Long, Long>> al : g) {
            int l = 0, r = al.size(), m = l + (r - l) / 2;
            while (l < r) {
                if (al.get(m).first < v) l = m + 1;
                else r = m;
                m = l + (r - l) / 2;
            }
            s += al.get(m).second;
        }
        return (s <= b);

    }
}
