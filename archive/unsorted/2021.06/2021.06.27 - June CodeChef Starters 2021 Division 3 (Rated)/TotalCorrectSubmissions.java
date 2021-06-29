package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TotalCorrectSubmissions {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < n * 3; i++) {
            String s = in.readString();
            int c = in.readInt();
            hm.put(s, hm.getOrDefault(s, 0) + c);
        }
        PriorityQueue< Integer> pq = new PriorityQueue<>();
        pq.addAll(hm.values());
        while (!pq.isEmpty()){
            out.print(pq.remove()+" ");
        }
        out.printLine();
    }

}
