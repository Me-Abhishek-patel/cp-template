package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long[] a = in.readLongArray(n);
        long sum = 0L;
        for (long l : a) {
            sum += l;
        }
        Arrays.sort(a);
        int m = in.readInt();
        for (int i = 0; i < m; i++) {
            long res = 0;

            long x = in.readLong(), y = in.readLong();
            int idx = Arrays.binarySearch(a, x);
            if (idx >= 0) {
                if (sum - a[idx] < y)
                    res = y - (sum - a[idx]);
            } else {
                idx = Math.abs(idx) - 1;
                if (idx >= n) {
                    if (sum - a[n - 1] < y)
                        res = y - (sum - a[n - 1]);
                    res += x - a[n - 1];
                } else if (idx == 0) {
                    if (sum - a[0] < y)
                        res = y - (sum - a[0]);
                } else {

                    long min = 0;
                    if (sum - a[idx] < y)
                       min =  y - (sum - a[idx]);
                    if (sum - a[idx-1] < y) {
                        res = y - (sum - a[idx - 1]);
                    }
                    res += x - a[idx - 1];
                    res = Math.min(res,min);
                }

            }
            out.printLine(res);

        }

    }

//    private int binarySearch(long[] a, long x) {
//        int l = 0, r = a.length - 1;
//        while (l <= r) {
//            int mid = l + (r - l) / 2;
//            if (a[mid] == x) return mid;
//            else if ()
//        }
//    }
}
