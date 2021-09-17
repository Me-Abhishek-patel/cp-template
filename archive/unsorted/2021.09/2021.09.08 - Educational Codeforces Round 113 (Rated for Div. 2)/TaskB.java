package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        String s = in.readLine();
        char[][] mat = new char[n][n];
        for (int i = 0; i < n; i++) {
            char ith = s.charAt(i);
            boolean won = false;
            for (int j = 0; j < n; j++) {
                char jth = s.charAt(j);
                if (i == j) mat[i][j] = 'X';
                else {
                    if (mat[i][j] != '\u0000') {
                        if (mat[i][j] == '+') won = true;
                    } else {
                        if (ith == '1') {
                            mat[i][j] = '=';
                            mat[j][i] = '=';
                        } else if (ith == '2') {
                            if (jth == '1') {
                                mat[i][j] = '=';
                                mat[j][i] = '=';
                            } else {
                                if (!won) {
                                    won = true;
                                    mat[i][j] = '+';
                                    mat[j][i] = '-';
                                } else {
                                    mat[i][j] = '-';
                                    mat[j][i] = '+';
                                }
                            }
                        }
                    }
                }
            }
            if (ith == '2' && !won) {
                out.printLine("NO");
                return;
            }
        }
        out.printLine("YES");
        out.printTable(mat);
    }
}
