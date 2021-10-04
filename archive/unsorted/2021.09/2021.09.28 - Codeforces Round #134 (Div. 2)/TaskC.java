package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskC {
    int[][] points;
    int n;
    boolean[] vis;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
//        ArrayList<ArrayList<IntIntPair>> adj = new ArrayList<>();
        n = in.readInt();
        vis = new boolean[n];
        points = new int[n][2];

        for (int i = 0; i < n; i++) {
            points[i][0] = in.readInt()-1;
            points[i][1] = in.readInt()-1;
        }
        int comp = -1;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(i);
                comp++;
            }
        }
        out.printLine(comp);


    }

    public void dfs(int i) {
        vis[i] = true;
        for (int j = 0; j < n; j++) {
            if ((points[i][0] == points[j][0] || points[i][1] == points[j][1]) && !vis[j]){
                dfs(j);
            }
        }
    }

}
