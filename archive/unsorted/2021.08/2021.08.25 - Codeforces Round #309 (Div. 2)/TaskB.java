package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int N = in.readInt();
        String[] board = new String[N];
        for (int i = 0; i < N; i++) board[i] = in.next();
        int res = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) if (board[j].equals(board[i])) count++;
            res = Math.max(res, count);
        }
        out.printLine(res);
    }
}
