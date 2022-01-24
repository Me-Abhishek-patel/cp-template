package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class Painter {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String p = in.readLine();


        int[] layer1 = new int[n + 1], layer2 = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (p.charAt(i) == 'Y') {
                layer1[i + 1] = 2;
            } else if (p.charAt(i) == 'B') {
                layer2[i + 1] = 4;

            } else {
                layer1[i + 1] = 2;
                layer2[i + 1] = 4;
            }
        }
        int strokes = 0;
        for (int i = 1; i < n+1; i++) {
            if (layer1[i - 1] != 2 && layer1[i] != layer1[i - 1]) strokes++;
        }
        for (int i = 1; i < n+1; i++) {
            if (layer2[i - 1] != 4 && layer2[i] != layer2[i - 1]) strokes++;
        }
        out.printLine("Case #" + testNumber + ": " + (strokes));

    }
}
