package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class ChefAndQueries {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), q = in.readInt();
        long[] arr = in.readLongArray(n);
        while (q-- > 0) {
            if (in.readInt() == 1) {
                long l = in.readLong(), r = in.readLong(), x = in.readLong();
                for (int i = (int) l - 1; i <= r - 1; i++) {
                    arr[i] = arr[i] + ((x + i + 1 - l) * (x + i + 1 - l));
                }
            } else {
                int y = in.readInt();
                out.printLine(arr[y - 1]);
            }

        }
        return;
    }
}
