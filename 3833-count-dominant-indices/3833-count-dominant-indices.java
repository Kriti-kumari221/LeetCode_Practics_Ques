class Solution {
    public int dominantIndices(int[] nums) {
         int n = nums.length;
        if (n <= 1) return 0;
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + nums[i];
        }

        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            int sumRight = suffixSum[i + 1];
            int elementsRight = n - i - 1;
            double avgRight = (double) sumRight / elementsRight;

            if (nums[i] > avgRight) {
                count++;
         
            }
        }

        return count;
    }
}