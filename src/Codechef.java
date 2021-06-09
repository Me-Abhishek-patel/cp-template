import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int x1 = in.nextInt();
            int x2 = in.nextInt();
            int x3 = in.nextInt();
            int r = in.nextInt();
            int x = Math.min(x1, x2);
            int y = Math.max(x1, x2);
            int lrx = Math.min(x3 + r, x3 - r);
            int lry = Math.max(x3 + r, x3 - r);
            int dif = Math.abs(x1 - x2);
            if (x > lry) System.out.println(dif);
            else if (y < lrx) System.out.println(dif);
            else if (x >= lrx && y <= lry) System.out.println(0);
            else if (x < lrx && y <= lry) System.out.println(lrx - x);
            else if (x <= lry && y > lry) System.out.println(y - lry);
            else System.out.println(dif - (Math.abs(lry - lrx)));

        }
    }
}

