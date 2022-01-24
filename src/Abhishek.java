import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Abhishek {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] a = {1, 2, 3, 3, 4, 5, 7, 7, 8, 11, 11, 26, 26};
        System.out.println(Arrays.binarySearch(a, 6));

    }


}
