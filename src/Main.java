import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        char[] s = in.nextLine().toCharArray();
        int n = s.length;
        int[] idx = new int[n];
        char min = Character.MAX_VALUE;
        int minIdx = n;
        for (int i = n - 1; i >= 0; i--) {
            if (min >= s[i]) {
                min = s[i];
                minIdx = i;
            }
            idx[i] = minIdx;
        }
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i <= n - 1; i++) {
            if (i == n - 1) {
                sb.append(s[i]);
            } else if (idx[i] != idx[i + 1]) {
                sb.append(s[i]);
                while (!st.isEmpty() && s[idx[i + 1]] > st.peek()) {
                    sb.append(st.pop());
                }
            } else {
                st.push(s[i]);
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        System.out.println(sb);
    }
}

