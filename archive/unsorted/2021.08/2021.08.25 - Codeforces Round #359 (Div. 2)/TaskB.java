package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = in.readIntArray(n);
        for (int i = n - 1; i > 0; --i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (arr[j] > arr[j + 1])
                {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = t;
                    out.printLine((j+1)+" "+(j+2));
                }
            }
        }
    }
}
