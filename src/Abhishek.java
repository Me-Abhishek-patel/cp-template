import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class Abhishek {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.remove(2);
        hs.remove(3);
        System.out.println(hs.size());

    }
}
