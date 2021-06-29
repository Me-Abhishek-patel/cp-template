package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long k = in.readLong(),x = in.readLong();
        long[] arr = in.readLongArray(n);
        Arrays.sort(arr);
        PriorityQueue<Long> pq = new PriorityQueue<>();
        int count = 1;
        for (int i = 1; i < n ; i++) {
            long diff = arr[i]-arr[i-1];
            if(diff>x) {
                count++;
                pq.add(diff);
            }
        }
        while (!pq.isEmpty()&& k>0){
            long diff = pq.remove();
            if(x>0)
            k -=(diff/x);
            else break;
            count--;
        }
        out.printLine(count);
    }
}
