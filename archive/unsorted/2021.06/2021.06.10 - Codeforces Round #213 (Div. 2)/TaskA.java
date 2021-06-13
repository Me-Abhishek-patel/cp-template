package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(),k = in.readInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[10];
            int t = in.readInt();
            boolean x = true;
            if(t==0)freq[0]++;
            while (t!=0){
                freq[t%10]++;
                t/=10;
            }
            for (int j = 0; j <= k; j++) {
                if(freq[j]==0) x= false;
            }
            if(x)sum++;
        }
        out.printLine(sum);
    }
}
