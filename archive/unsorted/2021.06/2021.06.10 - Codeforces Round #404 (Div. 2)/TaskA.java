package codes;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.readInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            String s = in.readLine();
            if(s.equals("Tetrahedron")) sum+=4;
            else if(s.equals("Cube")) sum+=6;
            else if(s.equals("Octahedron")) sum+=8;
            else if(s.equals("Dodecahedron")) sum+=12;
            else if(s.equals("Icosahedron")) sum+=20;

        }out.printLine(sum);
    }
}
