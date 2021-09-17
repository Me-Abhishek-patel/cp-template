package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        int[] d = in.readIntArray(m);
        Arrays.sort(d);
        int count = 0;
        boolean nfound = false;

        if(m>0&&(d[0]==1||d[m-1]==n))
        {
            out.printLine("NO");
            return;
        }
        for(int i=0;i<m-2;i++)
        {
            if((d[i+1]-d[i]==1)&&(d[i+2]-d[i+1]==1))
            {
                out.printLine("NO");
                return;
            }
        }

        out.printLine("YES");
    }
}
