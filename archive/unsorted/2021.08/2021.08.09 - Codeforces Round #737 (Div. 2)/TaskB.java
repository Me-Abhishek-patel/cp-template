package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;
import java.util.HashMap;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[] a = in.readIntArray(n);
//        int[] b = a.clone();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(a[i], i);
        }
        Arrays.sort(a);
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (hm.get(a[i]) - hm.get(a[i - 1]) != 1) count++;
        }
        if (count <= k)
            out.printLine("Yes");
        else out.printLine("No");

    }
}
