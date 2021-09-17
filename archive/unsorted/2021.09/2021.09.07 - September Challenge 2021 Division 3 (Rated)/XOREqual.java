package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashMap;
import java.util.Map;

public class XOREqual {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), x = in.readInt();
        int[] a = in.readIntArray(n);
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : a) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = freq.get(entry.getKey()) + freq.getOrDefault((entry.getKey() ^ x), 0);
            int change = freq.getOrDefault((entry.getKey() ^ x), 0);

            if (max < num && min > change) {
                max = num;
                min = change;
            }

        }
        out.printLine(max + " " + min);


    }
}
