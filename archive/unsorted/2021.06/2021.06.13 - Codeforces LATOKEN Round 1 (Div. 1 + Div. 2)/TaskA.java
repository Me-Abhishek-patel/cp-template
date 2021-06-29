package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt(), m = in.readInt();
        char[][] grid = in.readTable(n, m);
        int a = -1, b = -1;
        boolean x = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != '.') {
                    a = i;
                    b = j;
                    x = false;
//                    break;
                }
            }
//            if(x) break;
        }
        char odd = 'W', even = 'R';
        if (a != -1) {
            if ((a + b) % 2 == 0) {
                even = grid[a][b];
                odd = even == 'W' ? 'R' : 'W';
            } else {
                odd = grid[a][b];
                even = odd == 'W' ? 'R' : 'W';
            }
        }
        boolean isPossible = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '.') {
                    grid[i][j] = ((i + j) % 2 == 0) ? even : odd;
                } else {
                    if ((i + j) % 2 == 0) {
                        isPossible = (even == grid[i][j]);
                    } else {
                        isPossible = (odd == grid[i][j]);
                    }
                }
                if(!isPossible){
                    out.printLine("NO");
                    return;
                }
            }
        }
        if (isPossible) {
            out.printLine("YES");
            out.printTable(grid);
        } else out.printLine("NO");
    }


}
