import java.util.Arrays;
import java.util.Scanner;

public class Codeforces {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[m][2];

        for (int i = 0; i < m; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, (x, y) -> y[1] - x[1]);
        long sum = 0;
        for (int i = 0; i < m && n > 0; i++) {
            int[] arr = a[i];
            if (n >= arr[0]) {
                sum += ((long) arr[0] * arr[1]);
                n -= arr[0];
            } else {
                sum += ((long) n * arr[1]);
                n = 0;
            }

        }
        System.out.println(sum);

    }
}