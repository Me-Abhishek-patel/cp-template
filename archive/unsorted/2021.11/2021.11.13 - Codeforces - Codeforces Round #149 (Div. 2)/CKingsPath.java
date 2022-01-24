package codes;

import net.cplibrary.generated.collections.pair.IntIntPair;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.*;

public class CKingsPath {
    class State {
        IntIntPair pos;
        int d;

        public State(IntIntPair pos, int d) {
            this.pos = pos;
            this.d = d;
        }
    }

    final int[] row = {1, -1, 0, 0, 1, 1, -1, -1}, col = {0, 0, 1, -1, 1, -1, -1, 1};
    final int max = (int) 100_00_00_000;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int x = in.readInt(), y = in.readInt(), x1 = in.readInt(), y1 = in.readInt();
        int n = in.readInt();
        HashMap<Integer, ArrayList<IntIntPair>> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int r = in.readInt();
            ArrayList<IntIntPair> al = hm.getOrDefault(r, new ArrayList<>());
            al.add(new IntIntPair(in.readInt(), in.readInt()));
            hm.put(r, al);
        }
        Queue<State> q = new LinkedList<>();
        HashSet<IntIntPair> vis = new HashSet<>();
        q.add(new State(new IntIntPair(x, y), 0));
        while (!q.isEmpty()) {
            State s = q.poll();
            if (s.pos.first == x1 && s.pos.second == y1) {
                out.printLine(s.d);
                return;
            }
            for (int i = 0; i < 8; i++) {
                int x2 = s.pos.first + row[i], y2 = s.pos.second + col[i];
                if (isValid(x2, y2, hm, vis) && !vis.contains(new IntIntPair(x2,y2))) {
                    vis.add(new IntIntPair(x2, y2));
                    q.add(new State(new IntIntPair(x2, y2), s.d + 1));
                }
            }

        }
        out.printLine(-1);

    }

    private boolean isValid(int x, int y, HashMap<Integer, ArrayList<IntIntPair>> hm, HashSet<IntIntPair> vis) {
        if (x < 1 || x > max || y < 1 || y > max || !hm.containsKey(x)) return false;
        for (IntIntPair pair : hm.get(x)) {
            if (y >= pair.first && y <= pair.second)
                return true;
        }
        return false;

    }
}
