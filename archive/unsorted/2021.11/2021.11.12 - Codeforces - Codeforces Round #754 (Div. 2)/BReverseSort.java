package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.ArrayList;
import java.util.Collections;

public class BReverseSort {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String str = in.readLine();
        ArrayList<Integer> list = new ArrayList<>();
        int low = 0, hi = n - 1;
        while (low < hi) {
            while (low < n && str.charAt(low) != '1') low++;
            while (hi >= 0 && str.charAt(hi) != '0') hi--;
            if (low < hi && low < n && hi >= 0 && (str.charAt(low) == '1') && (str.charAt(hi) == '0')) {
                list.add(low + 1);
                list.add(hi + 1);
                low++;
                hi--;
            }
        }
        if (list.size() > 0) {
            out.printLine(1);
            out.print(list.size() + " ");
            Collections.sort(list);
            for (Integer integer : list) {
                out.print(integer + " ");
            }
            out.printLine();
        } else out.printLine(0);
    }
}
