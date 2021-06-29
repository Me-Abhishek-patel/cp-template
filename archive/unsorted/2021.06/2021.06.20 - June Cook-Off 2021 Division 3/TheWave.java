package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Arrays;
import java.util.HashSet;

public class TheWave {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), q = in.readInt();
        int[] arr = in.readIntArray(n);
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        Arrays.sort(arr);
        for (int i = 0; i < q; i++) {
            int x = in.readInt();
            if (set.contains(x)) {
                out.printLine(0);
                continue;
            }
            int count = 0;
//            if (x < arr[0]) count = n;

            int pos = Arrays.binarySearch(arr, x);
            count = n + pos+1;
            if (count % 2 == 0) out.printLine("POSITIVE");
            else out.printLine("NEGATIVE");
        }

    }
}
