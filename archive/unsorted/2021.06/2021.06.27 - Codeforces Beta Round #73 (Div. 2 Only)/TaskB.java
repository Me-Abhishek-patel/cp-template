package codes;

import net.egork.generated.collections.pair.IntIntPair;
import net.egork.geometry.Point;
import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.ArrayList;
import java.util.HashMap;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt(), x = in.readInt();
        char[][] keyboard = in.readTable(n, m);
        int q = in.readInt();
        String T = in.readLine();
        HashMap<Character, ArrayList<IntIntPair>> keys = new HashMap<Character, ArrayList<IntIntPair>>();
        ArrayList<IntIntPair> shiftPos = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (keyboard[i][j] == 'S') {
                    shiftPos.add(new IntIntPair(i, j));
                } else {
                    ArrayList<IntIntPair> pair = keys.getOrDefault(keyboard[i][j], new ArrayList<>());
                    pair.add(new IntIntPair(i, j));
                    keys.put(keyboard[i][j], pair);
                }
            }
        }
        int count = 0;
        for (char c : T.toCharArray()) {
            if (!keys.containsKey(c)) {
                c = Character.toLowerCase(c);
                if (!keys.containsKey(c) |  shiftPos.isEmpty()  ) {
                    out.printLine(-1);
                    return;
                }

                boolean isPossible = false;
                for (IntIntPair intIntPair : keys.get(c)) {
                    if (getDistance(intIntPair, shiftPos, x)) {
                        isPossible = true;
                        break;
                    }
                }
                if (!isPossible) count++;

            }
        }
        out.printLine(count);

    }

    private boolean getDistance(IntIntPair intIntPair, ArrayList<IntIntPair> shiftPos, int x) {
        for (IntIntPair intPair : shiftPos) {
            if (new Point(intPair.first, intPair.second)
                    .distance(new Point(intIntPair.first, intIntPair.second)) <= x) return true;
        }
        return false;
    }
}
