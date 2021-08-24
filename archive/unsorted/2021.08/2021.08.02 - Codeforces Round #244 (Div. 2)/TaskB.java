package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), t = in.readInt(), c = in.readInt();
        int[] arr = in.readIntArray(n);
//        Arrays.sort(arr);
        int choice = 0;
        int cont = 0;
        for (int i = 0; i < n ; i++) {
            if (arr[i] <= t) cont++;
            else {
                if (cont >= c) {
                    choice += cont - c + 1;
                }
                cont = 0;
            }
        }
        if (cont >= c) {
            choice += cont - c + 1;
        }
        out.printLine(choice);
    }

}
