import java.util.Scanner;

public class Codechef {

    public static void swap(int[] a, int x, int y) {

        a[x] = a[x] ^ a[y];
        a[y] = a[x] ^ a[y];
        a[x] = a[x] ^ a[y];
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }

        int count = 0;
        int i = 1;

        while (i != n) {

            if (a[i - 1] != i) {
                swap(a, a[i - 1] - 1, i - 1);
                count++;
            }

            i++;
        }

        System.out.println(count);
    }
}