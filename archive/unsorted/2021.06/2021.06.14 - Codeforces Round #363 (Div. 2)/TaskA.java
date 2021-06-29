package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        char[] dir = in.readString().toCharArray();
        int[] arr = in.readIntArray(n);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if(dir[i-1] =='R' &&  dir[i]=='L'){
                int k = Math.abs(arr[i]-arr[i-1])/2;
                min = Math.min(k,min);
            }
        }
        if(min==Integer.MAX_VALUE) out.printLine(-1);
        else out.printLine(min);
    }
}
