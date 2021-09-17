
import java.io.*;
import java.util.StringTokenizer;

class Scanner {
    StringTokenizer st;
    BufferedReader br;

    public Scanner(InputStream s) {
        br = new BufferedReader(new InputStreamReader(s));
    }

    public String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public String nextLine() throws IOException {
        return br.readLine();
    }

    public double nextDouble() throws IOException {
        String x = next();
        StringBuilder sb = new StringBuilder("0");
        double res = 0, f = 1;
        boolean dec = false, neg = false;
        int start = 0;
        if (x.charAt(0) == '-') {
            neg = true;
            start++;
        }
        for (int i = start; i < x.length(); i++)
            if (x.charAt(i) == '.') {
                res = Long.parseLong(sb.toString());
                sb = new StringBuilder("0");
                dec = true;
            } else {
                sb.append(x.charAt(i));
                if (dec)
                    f *= 10;
            }
        res += Long.parseLong(sb.toString()) / f;
        return res * (neg ? -1 : 1);
    }

    public boolean ready() throws IOException {
        return br.ready() || st.hasMoreTokens();
    }

}

public class Main {
    //    static int[] dx = {0, 0, 1, -1, 1, 1, -1, -1}, dy = {1, -1, 0, 0, -1, 1, -1, 1};
    static int dx[] = {0, 0, 1, -1, -1, 1, -1, 1}, dy[] = {1, -1, 0, 0, -1, 1, 1, -1};

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t = 1;

        while (true) {
            int n = in.nextInt();
            boolean[][] war = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                String s = in.next();
                for (int j = 0; j < s.length(); j++) {
                    war[i][j] = (s.charAt(j) == '1');
                }
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (war[i][j]) {
                        count++;
                        dfs(war, i, j, n);
                    }
                }
            }
            System.out.println("Image number " + t + " contains " + count + " war eagles.");
            t++;
            if (!in.ready()) break;
        }


    }

    private static void dfs(boolean[][] war, int i, int j, int n) {
        if (i < 0 || i >= n || j < 0 || j >= n || !war[i][j]) return;
        war[i][j] = false;
        for (int k = 0; k < 8; k++) {
            dfs(war, i + dx[k], j + dy[k], n);
        }
    }


}

