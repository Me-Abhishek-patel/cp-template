package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

import java.util.LinkedList;
import java.util.Queue;

public class CSoldierAndCards {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        Queue<Integer> q1 = new LinkedList<>();
        int k = in.readInt();
        for (int i = 0; i < k; i++) {
            q1.add(in.readInt());
        }
        Queue<Integer> q2 = new LinkedList<>();
        k = in.readInt();
        for (int i = 0; i < k; i++) {
            q2.add(in.readInt());
        }
        int moves = 0;
        while (moves < 100000) {
            moves++;
            int a = q1.remove(), b = q2.remove();
            if(a>b){
                q1.add(b);
                q1.add(a);
            }else{
                q2.add(a);
                q2.add(b);
            }
            if(q2.size()==0){
                out.printLine(moves+" "+1);
                return;
            }
            if(q1.size()==0){
                out.printLine(moves+" "+2);
                return;
            }
        }
        out.printLine(-1);
    }
}
