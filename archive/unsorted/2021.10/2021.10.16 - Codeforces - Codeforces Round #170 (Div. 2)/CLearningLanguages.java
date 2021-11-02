package codes;

import helpers.DSU;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;
import java.util.HashSet;

public class CLearningLanguages {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
        DSU dsu = new DSU(n);
        for (int i = 0; i < n; i++) {
            int k = in.readInt();
            hm.put(i, new HashSet<>());
            for (int i1 = 0; i1 < k; i1++) {
                hm.get(i).add(in.readInt());
            }

        }
        int count = 0;
//        while (true) {
        boolean x = false;
        for (int i = 0; i < n; i++) {
            if(hm.get(i).size()>0)x = true;
            for (int j = 0; j < n; j++) {
                int p = dsu.find(i), q = dsu.find(j);
                if (p != q) {
                    for (int i1 : hm.get(p)) {
                        if (hm.get(q).contains(i1)) {
                            dsu.union(p, q);
                            hm.get(p).addAll(hm.get(q));
                            break;
                        }
                    }

                }

            }

        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(dsu.parent[i]);
        }
//        out.printLine(dsu.parent);
        out.printLine(!x?n:hs.size() - 1);
//        }

    }
}
