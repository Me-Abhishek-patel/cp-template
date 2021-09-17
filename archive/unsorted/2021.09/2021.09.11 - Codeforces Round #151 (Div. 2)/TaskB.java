package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.misc.ArrayUtils;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        long sum = ArrayUtils.sumArray(a) ;
        if(sum%n==0)out.printLine(n);
        else out.printLine(n-1);
        

    }
}
