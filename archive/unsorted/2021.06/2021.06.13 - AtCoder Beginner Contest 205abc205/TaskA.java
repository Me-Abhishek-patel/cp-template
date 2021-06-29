package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Arrays;
import java.util.HashSet;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), q = in.readInt();
        long[] arr = in.readLongArray(n);
        HashSet<Long> set = new HashSet<>();
        for (long i : arr) {
            set.add(i);
        }

        Arrays.sort(arr);
        for (int i = 0; i < q; i++) {
            long k = in.readInt();
//            if (k < arr[0]) out.printLine(k);
//            else if (k > arr[n - 1]) out.print(k + n);
//            else {
                long x = k;
                long step = 0;
                while (step < x) {

                    long pos = Math.abs(Arrays.binarySearch(arr, k)) + 1;
                    step = (k - pos);
                    k += (x - step);

                }
                out.printLine(k);
//            }


        }

    }
}
