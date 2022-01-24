package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;

public class DNotQuiteLee {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        int[] a = in.readIntArray(n);
        go(a, 0, 0, new ArrayList<Integer>());
//        out.printLine(res);

    }

    private void go(int[] a, int i, int sum, ArrayList<Integer> arrayList) {
        if (i == a.length) {
            System.out.print(arrayList.toString()+" ");
            System.out.println(sum);
            return;
        }
        go(a, i + 1, sum, new ArrayList<Integer>(arrayList));
        arrayList.add(a[i]);
        go(a, i + 1, sum + a[i], new ArrayList<>(arrayList));

    }


}
