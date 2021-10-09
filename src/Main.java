import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    static boolean eps = false;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        convert(s);
    }

    private static void convert(String s) {
        String a = s.substring(0, s.indexOf('>') - 1);
        String[] t = s.substring(s.indexOf('>') + 1).split("\\|");
        ArrayList<String> al = new ArrayList<>(Arrays.asList(t));
        Collections.sort(al);
        for (int i = 0; i < al.size(); i++) {

        }


        eps = false;
//        System.out.println(Arrays.toString(t));

        StringBuilder sb = checkAmbiguity(t);


        if (sb.length() >= 1) {
            System.out.println(a + "->" + sb + a + "'");
            StringBuilder newSb = new StringBuilder();
            newSb.append(a).append("'->");
            boolean ep = false;

            if (ep) newSb.append("E");
            System.out.println(newSb);
            System.out.println("\n\n");

            convert(newSb.toString());

        }

    }

    private static StringBuilder checkAmbiguity(String[] t) {

        StringBuilder sb = new StringBuilder();
        int k = 0;
        boolean x = true;
        while (x && t.length > 0) {
            char c = '.';
            if (k < t[0].length())
                c = t[0].charAt(k);
            int i = 0;
            for (; i < t.length; i++) {
                if (k >= t[i].length()) {
                    eps = true;
                    continue;
                }
                if (t[i].charAt(k) != c) {
                    x = false;
                    break;
                }
            }
            k++;
            if (x) sb.append(c);

        }
        return sb;
    }
}



