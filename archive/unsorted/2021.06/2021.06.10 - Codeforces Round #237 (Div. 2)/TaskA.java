package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        char[][] arr = in.readTable(n, n);
        char x = arr[0][0], y = arr[0][1];
        if(y==x){
            out.printLine("NO");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j || j==n-i-1){
                    if(arr[i][j]!=x){
                        out.printLine("NO");
                        return;
                    }
                }else{
                    if(arr[i][j]!=y){
                        out.printLine("NO");
                        return;
                    }
                }
            }
        }
        out.printLine("YES");
    }
}
