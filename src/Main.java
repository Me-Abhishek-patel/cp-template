import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhishek Patel
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        HowIMetYourMother solver = new HowIMetYourMother();
        int testCount = Integer.parseInt(in.next());
        for (int i = 1; i <= testCount; i++)
            solver.solve(i, in, out);
        out.close();
    }

    static class HowIMetYourMother {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x1 = in.nextInt();
            int x2 = in.nextInt();
            int x3 = in.nextInt();
            int r = in.nextInt();
            int x = Math.min(x1, x2);
            int y = Math.max(x1, x2);
            long lrx = Math.min(x3 + r, x3 - r);
            long lry = Math.max(x3 + r, x3 - r);
            long dif = Math.abs(x1 - x2);
            if (x > lry) out.println(dif);
            else if (y < lrx) out.println(dif);
            else if (x >= lrx && y <= lry) out.println(0);
            else if (x < lrx && y <= lry) out.println(lrx - x);
            else if (x <= lry && y > lry) out.println(y - lry);
            else out.println(dif - (Math.abs(lry - lrx)));


        }

    }
}

