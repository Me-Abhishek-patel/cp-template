package codes;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;
import java.util.HashSet;

public class PointsAndLines {
    public void solve(int testNumber, InputReader sc, OutputWriter out) {

        int n = sc.readInt();
        HashSet<Integer> xxxx = new HashSet<>();
        HashSet<Integer> yyyy = new HashSet<>();
        extracted(sc, n, xxxx, yyyy);
        out.printLine(xxxx.size() + yyyy.size());
    }

    private void extracted(InputReader sc, int n, HashSet<Integer> xxxx, HashSet<Integer> yyyy) {
        for (int i = 0; i < n; i++) {
            xxxx.add(sc.readInt());
            yyyy.add(sc.readInt());
        }
    }
}