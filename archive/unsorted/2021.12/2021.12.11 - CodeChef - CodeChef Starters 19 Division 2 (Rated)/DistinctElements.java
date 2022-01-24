package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.numbers.IntegerUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DistinctElements {
    int mod = 1000000000 + 7;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : a) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        Arrays.sort(a);
        long res = go(a, 0, hm);

        out.printLine(res - 1);


    }

    private long go(int[] a, int i, HashMap<Integer, Integer> hm) {
        if (i == a.length) {
            return 1;
        }
        if (hm.get(a[i]) != 1) {
            long x = go(a, i + hm.get(a[i]), hm);
            return ((x % mod * hm.get(a[i]) % mod) % mod + x % mod) % mod;
        } else {
            return (2 % mod * go(a, i + 1, hm) % mod) % mod;
        }

    }


}
