package codes;

import helpers.MyGraph;
import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.math.BigInteger;

public class CLittleAlawnsPuzzle {
    int mod = (int) 1e9 + 7;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        MyGraph graph = new MyGraph(n);
        int[] a = in.readIntArray(n);
        int[] b = in.readIntArray(n);
        for (int i = 0; i < n; i++) {
            graph.addEdge(a[i] - 1, b[i] - 1);
        }
        int comp = graph.countConnectedComponents();
        BigInteger p= new BigInteger(String.valueOf(comp));
        BigInteger ba = new BigInteger(String.valueOf(2));
        out.printLine((ba.pow(comp).mod(BigInteger.valueOf(mod))).intValue());

    }
}
