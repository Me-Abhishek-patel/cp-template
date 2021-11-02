package codes;



import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CGregAndArray {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt(), k = in.readInt();
        long[] a = in.readLongArray(n);
        long[][] opr = in.readLongTable(m, 3);
        long[] c = new long[m];
        long[] b = new long[n];

        for (int i = 0; i < k; i++) {
            int x = in.readInt(), y = in.readInt();
            if (x - 2 >= 0)
                c[x - 2] -= 1;
            c[y - 1] += 1;
        }

        for (int i = m - 1; i >= 0; i--) {
            opr[i][2] = opr[i][2] * c[i];
            if (i - 1 >= 0)
                c[i - 1] += c[i];
        }
        for (int i = 0; i < m; i++) {
            if (opr[i][0] - 2 >= 0)
                b[(int) (opr[i][0] - 2)] -= opr[i][2];
            b[(int) (opr[i][1] - 1)] += opr[i][2];
        }
        for (int i = n - 1; i >= 0; i--) {
            a[i] += b[i];
            if (i - 1 >= 0)
                b[i-1] +=b[i];
        }
        out.printLine(a);

    }
}
