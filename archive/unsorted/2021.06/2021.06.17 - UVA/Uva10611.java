package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class Uva10611 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long[] arr = in.readLongArray(n);
        int q = in.readInt();
        for (int i = 0; i < q; i++) {
            long k = in.readLong();
            int lo = 0, hi = n - 1;
            int mid = 0;
            while (lo < hi) {
                mid = (lo + hi) / 2;
                if (arr[mid] <k) lo = mid + 1;
                else if (arr[mid] > k) hi = mid - 1;
                else hi = mid;
            }
            String low = "X", high = "X";
            if (arr[mid] == k) {
                if (mid != 0) low = String.valueOf(arr[mid - 1]);
            }
            lo = 0;
            hi = n - 1;
            while (lo < hi) {
                mid = (lo + hi) / 2;
                if (arr[mid] <k) lo = mid + 1;
                else if (arr[mid] > k) hi = mid - 1;
                else lo = mid;
            }
            if (arr[mid] == k) {
                if (mid != n-1) high = String.valueOf(arr[mid + 1]);
            }
            else {
                high = String.valueOf(arr[mid]);
            }
            out.printLine(low + " " + high);
        }


    }
}
