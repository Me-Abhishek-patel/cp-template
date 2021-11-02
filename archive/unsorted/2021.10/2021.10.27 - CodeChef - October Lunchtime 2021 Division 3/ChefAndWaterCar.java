package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class ChefAndWaterCar {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n = in.readLong() - 1, v = in.readLong();
        long max = (n * (n + 1)) / 2L;
        if (v >= n) {
            out.printLine(max + " " + n);
            return;
        }
        long min = v - 1;
        n = n-min;
        min+=( (n * (n + 1L)) / 2L);
        out.printLine(max + " " + min);

    }
}
