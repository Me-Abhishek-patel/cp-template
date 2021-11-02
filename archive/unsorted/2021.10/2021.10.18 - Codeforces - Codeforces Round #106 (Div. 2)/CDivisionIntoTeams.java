package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;

public class CDivisionIntoTeams {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = in.readInt();
            a[i][1] = i + 1;
        }
        Arrays.sort(a, (x, y) -> x[0] - y[0]);
        ArrayList<Integer> al = new ArrayList<>(), al2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) al.add(a[i][1]);
            else al2.add(a[i][1]);
        }
        out.printLine(al.size());
        out.printLine(al.toArray());
        out.printLine(al2.size());
        out.printLine(al2.toArray());

//        out.printLine();
    }
}
