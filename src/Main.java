import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        class Inner {
            final String name;

            public Inner(String s) {
                name = s;
            }
        }
        Object obj = new Inner("AAA");
        Inner t = (Inner) obj;
        System.out.println(t.name);
    }

    private static void convert(String s) {
        char a = s.charAt(0);
        String[] t = s.substring(s.indexOf('>') + 1).split("\\|");
        StringBuilder sb = new StringBuilder();
        int k = 0;
        boolean x = true;
        while (x && t.length > 0) {
            char c = t[0].charAt(k);
            for (int i = 0; i < t.length; i++) {
                if (t[i].charAt(k) != c) {
                    x = false;
                    break;
                }
            }
            k++;
            if (x) sb.append(c);
        }
        if (sb.length() >= 1) {
            System.out.println(a + "->" + sb + a + "'");
            System.out.print(a + "'->");
            boolean ep = false;
            for (int i = 0; i < t.length; i++) {
                if (sb.length() != t[i].length()) {
                    System.out.print(t[i].substring(sb.length()) + "|");
                } else ep = true;

            }
            if (ep) System.out.print("E");
            System.out.println("\n\n");
        } else System.out.println(s);

    }


}




