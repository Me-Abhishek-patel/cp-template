package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.HashMap;
import java.util.Map;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String[] s = in.readStringArray(n);
        HashMap<String,Long> counter = new HashMap<>();
        for (String s1 : s ) {
            counter.put(s1,counter.getOrDefault(s1, 0L)+1);
        }
        long max = Long.MIN_VALUE;
        String res = "";
        for (Map.Entry<String, Long> inEntry : counter.entrySet() ) {
            if(inEntry.getValue()>max){
                res = inEntry.getKey();
                max = inEntry.getValue();
            }
        }
        out.printLine(res);

    }
}
