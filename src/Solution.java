class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int[] presum = new int[nums.length];
        presum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            presum[i] = presum[i - 1] + nums[i];
        }
        return 0;
    }
}