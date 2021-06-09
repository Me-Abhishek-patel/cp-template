
public class SudokuTypo {
    public int fix(int[] digits) {
        boolean[] arr = new boolean[10];
        for (int i = 1; i <= 81; i++) {
            arr[digits[i - 1]] = true;
            if (i % 9 == 0) {
                for (int j = 1; j <= 9; j++) {
                    if (!arr[j]) return j;
                }
                arr = new boolean[10];
            }
        }
        return 0;
    }

}
