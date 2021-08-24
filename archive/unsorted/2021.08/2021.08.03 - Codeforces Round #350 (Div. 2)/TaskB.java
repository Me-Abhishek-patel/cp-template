package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[] arr = in.readIntArray(n);
        int i = 1;
        while(i<k){
            k-=i++;
        }
        out.printLine(arr[k-1]);
    }
}
