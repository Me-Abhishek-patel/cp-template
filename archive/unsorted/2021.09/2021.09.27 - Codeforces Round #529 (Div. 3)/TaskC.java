package codes;


import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Collections;
import java.util.PriorityQueue;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        if (Integer.bitCount(n) > k) {
            out.printLine("NO");
            return;
        }
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while (n != 0) {
            if ((n & 1) != 0) {
                pq.add((1 << count));
//                System.out.println((1<<count)+" ");
            }
            count++;
            n = n >> 1;
        }
        while (pq.size()<k){
            int x = pq.poll();
            if(x==1){
                out.printLine("NO");
                return;
            }
            pq.add(x/2);
            pq.add(x-(x/2));
        }
        out.printLine("YES");
        while (!pq.isEmpty()){
            out.print(pq.poll()+" ");
        }
        out.printLine();
    }
}
