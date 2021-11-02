package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CStatues {
    static int[] dRow = {0, 1, 0, -1, 0, -1, 1, -1, 1};
    static int[] dCol = {-1, 0, 1, 0, 0, -1, -1, 1, 1};

    boolean res;
    char[][] in;
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        this.in = in.readTable(8, 8);
        boolean[][] vis = new boolean[8][8];
        res = false;
        if (DFS(7,0,0)) out.printLine("WIN");
        else out.printLine("LOSE");
    }

    public boolean DFS(int x, int y, int step)
    {
        if(step > 8) return true;
        boolean ret = false;
        for(int i=0;i<9;i++)
        {
            int a = x + dRow[i];
            int b = y + dCol[i];
            if(a < 0 || b < 0 || a >= 8 || b >= 8) continue;
            if(a >= step && this.in[a-step][b] == 'S') continue;
            if(a >= step + 1 && in[a-step-1][b] == 'S') continue;
            ret |= DFS(a,b,step+1);
        }
        return ret;
    }



    private void movedown(char[][] a) {
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 8; j++) {
                if (i != 7) {
                    if (a[i][j] == 'S') {
                        a[i + 1][j] = 'S';
                    }
                }
                a[i][j] = '.';

            }
        }
    }
}
