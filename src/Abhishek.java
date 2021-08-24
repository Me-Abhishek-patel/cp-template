import java.io.IOException;
import java.util.Scanner;

public class Abhishek {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt(), b = in.nextInt();
        boolean inversion = false;
        if (a != b) {
            System.out.println("rated");
            return;
        }
        for (int i = 1; i < n; i++) {
            int a1 = in.nextInt(), b1 = in.nextInt();
            if (a1 != b1) {
                System.out.println("rated");
                return;
            }
            if (a < a1) inversion = true;
            a = a1;
        }
        if (inversion) System.out.println("unrated");
        else System.out.println("maybe");
        int princ = in.nextInt();

    }
}
