package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        int count = 0, c = 0;
        for (int i = 0; i < n; i++) {
            boolean inverse = false;
            for (int j = i % 2; j < n - 1; j += 2) {
                if (a[j] > a[j + 1]) {
                    inverse = true;
                    swap(a, j, j + 1);
                }
            }
            if (inverse) {
                if (c != 0){
                    count++;
                    c=0;
                }
                    count++;
            } else {
                c++;
                if (c >= 2) break;
            }

        }
        out.printLine(count);
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
