package codes;

import java.util.Scanner;
import java.io.PrintWriter;

public class HowIMetYourMother {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
            long x1 = in.nextLong();
            long x2 = in.nextLong();
            long x3 = in.nextLong();
            long r = in.nextLong();
            long x = Math.min(x1, x2);
            long y = Math.max(x1, x2);
            long lrx = Math.min(x3 + r, x3 - r);
            long lry = Math.max(x3 + r, x3 - r);
            long dif = Math.abs(x - y);
            if (x > lry) out.println(dif);
            else if (y < lrx) out.println(dif);
            else{
                long res = 0;
                if(y>lry) res+=y-lry;
                if(x<lrx) res+=lrx-x;
                out.println(res);
            }


    }
}
