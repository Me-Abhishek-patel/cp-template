package codes;

import net.cplibrary.io.InputReader;
import net.cplibrary.io.OutputWriter;

public class CSerejaAndAlgorithm {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s = in.readLine();
        int[][] xyz = new int[s.length() + 1][3];
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'x':
                    x++;
                    break;
                case 'y':
                    y++;
                    break;
                case 'z':
                    z++;
                    break;
            }
            xyz[i + 1][0] = x;
            xyz[i + 1][1] = y;
            xyz[i + 1][2] = z;

        }
        int m = in.readInt();
        for (int i = 0; i < m; i++) {
            int l = in.readInt() , r = in.readInt();
            x = xyz[r][0] - xyz[l - 1][0];
            y = xyz[r][1] - xyz[l - 1][1];
            z = xyz[r][2] - xyz[l - 1][2];
            if (x + y + z < 3) {
                out.printLine("YES");
            } else if (Math.abs(x - y) > 1 || Math.abs(y - z) > 1 || Math.abs(x - z) > 1) {
                out.printLine("NO");
            }else {
                out.printLine("YES");
            }
        }

    }
}
