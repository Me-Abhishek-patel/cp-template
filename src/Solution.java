class Solution {
    int res = 0;

    public int stoneGameII(int[] piles) {
        int[] preSum = new int[piles.length];
        preSum[0] = piles[0];
        res = 0;
        for (int i = 1; i < piles.length; i++) {
            preSum[i] = preSum[i - 1] + piles[i];
        }
        res = go(0, 1, piles, true);
        return res;

    }

    private int go(int i, int m, int[] preSum, boolean b) {
        if (i == preSum.length) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int temp = 0, temp2 = 0;
        int sum = 0;
        for (int x = 1; x <= 2 * m && i + x < preSum.length; x++) {

            sum += preSum[i + x - 1];
            temp = go(i + x, Math.max(m, x), preSum, !b);
            if (max < temp + sum) {
                temp2 = temp;
                max = Math.max(max, temp + sum);
            }

        }

        if (b) {
            return max;
        } else return temp2;

    }
}