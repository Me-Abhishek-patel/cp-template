package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;
import java.util.Comparator;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), t1 = in.readInt(), t2 = in.readInt(), k = in.readInt();
        double[][] arr = new double[n][2];
        double d = (double) (100 - k) / 100.0;
        for (int i = 0; i < n; i++) {
            arr[i][0] = i + 1;
            int a = in.readInt();
            int b = in.readInt();
            arr[i][1] = Math.max(t1 * a * d + t2 * b, t1 * b * d + t2 * a);
        }
        Arrays.sort(arr, new Comparator<double[]>() {
            @Override
            public int compare(double[] o1, double[] o2) {
                return Double.compare(o2[1], o1[1])==0?(int) (o1[0]-o2[0]):Double.compare(o2[1], o1[1]);
            }
        });
        for (double[] o : arr) {
            out.printFormat("%d %.2f",(int)o[0],o[1]);
            out.printLine( );
        }


    }

}
