package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CCaseOfMatryoshkas {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), k = in.readInt();
        int[][] chains = new int[k][];
        for (int i = 0; i < k; i++) {
            chains[i] = in.readIntArray(in.readInt());
        }
        int count = 0, sum = 0;
        boolean x = true;
        for (int i = 0; i < k; i++) {
            for (int j = 1; j < chains[i].length; j++) {
                if (chains[i][0] == 1 && chains[i][j] - 1 == chains[i][j - 1]) count++;
                else sum++;
                if (chains[i][0] == 1 && chains[i][j] - 1 != chains[i][j - 1]) x = false;

            }
        }
//        if(!x)sum+=count;
        out.printLine(2*n-k-1-2*count);

    }
}
