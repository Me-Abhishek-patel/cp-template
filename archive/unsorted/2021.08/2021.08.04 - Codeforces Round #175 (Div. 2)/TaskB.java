package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), s = in.readInt(), t = in.readInt();
        int[] arr = in.readIntArray(n);

        if (s == t) {
            out.printLine(0);
            return;
        }

        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        boolean cyclic = false;
        while (arr[s - 1] != t ) {
            if(set.contains(s)){
                out.printLine(-1);
                break;
            }
            set.add(s);
            s = arr[s - 1];
            count++;
        }
        if (set.contains(s)) ;
        else
            out.printLine(count + 1);
    }
}
