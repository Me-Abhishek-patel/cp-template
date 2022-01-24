package codes;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;

public class BWetSharkAndBishops {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = new int[2001];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = in.readInt(), y = in.readInt();
            a[x + y]++;
            hm.put(x - y, hm.getOrDefault(x - y, 0) + 1);
        }
        long res = 0;
        for (int i = 0; i < 2000; i++) {
            res += ((long) a[i] * (a[i] - 1)) / 2;
        }
        for (Integer value : hm.values()) {
            res+=((long) value*(value-1))/2;
        }
        out.printLine(res);
    }
}
