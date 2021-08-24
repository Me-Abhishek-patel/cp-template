package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.HashSet;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt(), k = in.readInt();
//        int[] arr = in.readIntArray(m);
        HashSet<Integer> holes = new HashSet<Integer>();
        for (int i = 0; i < m; i++) {
            holes.add(in.readInt());
        }


        int[][] swaps = in.readIntTable(k, 2);
        int curr = 1;
        if (holes.contains(curr)) {
            out.printLine(curr);
            return;
        }
        for (int[] swap : swaps) {
            if (swap[0] == curr ) {
                if(holes.contains(swap[1])){
                    out.printLine(swap[1]);
                    return;
                }else {
                    curr = swap[1];
                }
            }else if(swap[1] == curr) {
                if(holes.contains(swap[0])){
                    out.printLine(swap[0]);
                    return;
                }else {
                    curr = swap[0];
                }
            }
        }
        out.printLine(curr);


    }
}
