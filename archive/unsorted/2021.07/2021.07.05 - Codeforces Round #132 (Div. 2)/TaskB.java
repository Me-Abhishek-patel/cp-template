package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;
import net.egork.misc.ArrayUtils;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] x = in.readIntArray(n);
        int m = in.readInt();
        int[] y = in.readIntArray(m);
        int k = in.readInt();
        int[] z = in.readIntArray(k);
        int a = in.readInt(),b = in.readInt();
        double ratio = (double) a/(double) b;
        double p2 = ArrayUtils.minElement(z)*ratio;
        double r1 = ArrayUtils.maxElement(x);
        r1 = r1*r1;
        double max = Long.MIN_VALUE;
        for (int i = 0; i < y.length; i++) {
            double res =( y[i]*r1)/(p2+y[i]);
            max = Math.max(max,res);
        }
        out.printLine(Math.sqrt(max)+ 1e-6);


    }

}
