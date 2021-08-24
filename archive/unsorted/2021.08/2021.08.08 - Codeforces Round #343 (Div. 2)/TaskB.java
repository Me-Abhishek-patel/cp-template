package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] boy = new int[367], girl = new int[367];
        for (int i = 0; i < n; i++) {
            String[] s = in.readLine().split(" ");
            boolean isM = s[0].equals("M");
            for (int j = Integer.parseInt(s[1]); j <= Integer.parseInt(s[2]); j++) {
                if (isM) boy[j]++;
                else girl[j]++;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 367; i++) {
            max = Math.max(max,2*Math.min(girl[i],boy[i]));
        }
        out.printLine(max);
    }
}
