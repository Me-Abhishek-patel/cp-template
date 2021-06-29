package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.ArrayList;

public class BinaryStringOnSteroids {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readString();
        if(!s.contains("1")) {
            out.printLine("0");
            return;
        }
        int x = s.indexOf('1');
        int prev = x;
        ArrayList<Integer> al = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = prev+1; i < n; i++) {
            if(s.charAt(i)=='1') {
                al.add(i - prev);
                min = Math.min(min,i-prev);
                prev = i;
            }
        }
        al.add((n-1)-prev+(x));



    }
}
