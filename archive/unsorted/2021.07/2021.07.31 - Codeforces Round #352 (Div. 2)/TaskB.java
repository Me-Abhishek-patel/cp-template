package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;
import net.cplibrary.string.StringUtils;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] arr = StringUtils.freqArray(in.readString());
        int diff = 0,used = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=1) {
                diff += arr[i] - 1;
                used++;
            }
        }
        if(26-used<diff)out.printLine(-1);
        else out.printLine(diff);

    }
}
