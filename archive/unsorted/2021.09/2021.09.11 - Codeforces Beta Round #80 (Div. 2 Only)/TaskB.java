package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
//            if(a[i]==1){
//                sum+=a[i];
//            }else
                sum+=a[i]+((long) (a[i] - 1) *i);
        }
        out.printLine(sum);
    }
}
