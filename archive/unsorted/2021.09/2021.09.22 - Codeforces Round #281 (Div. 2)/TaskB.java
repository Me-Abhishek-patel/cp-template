package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        long fsum = 0, ssum = 0;
        ArrayList<Integer> first = new ArrayList<>(), second = new ArrayList<>();
        for (int i : a) {
            if (i > 0) {
                first.add(i);
                fsum += i;
            } else {
                second.add(Math.abs(i));
                ssum += Math.abs(i);
            }
        }
        if (fsum > ssum) {
            out.printLine("first");
        } else if (fsum < ssum) {
            out.printLine("second");
        } else {
            for (int i = 0; i < Math.min(first.size(), second.size()); i++) {
                if(first.get(i)>second.get(i)){
                    out.printLine("first");
                    return;
                }else if(first.get(i)< second.get(i)){
                    out.printLine("second");
                    return;
                }
            }
            if(a[n-1]>0){
                out.printLine("first");
            }else {
                out.printLine("second");
            }
        }

    }
}
