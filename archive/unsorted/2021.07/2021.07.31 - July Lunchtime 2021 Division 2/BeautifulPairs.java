package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class BeautifulPairs {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = in.readIntArray(n);
        Arrays.sort(arr);
        long same = 0;
        for (int i = 0; i < n ; i++) {
            int count = 1;
            while (i < n-1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }
            same += (long) count * (count - 1);


        }
        out.printLine((long) (((long) n * (n - 1))) - same);
    }
}
