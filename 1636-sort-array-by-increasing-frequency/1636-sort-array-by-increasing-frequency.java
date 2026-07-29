class Solution {
    public int[] frequencySort(int[] nums) {
        int min = nums[0], max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int[] count = new int[max - min + 1];
        for (int num : nums) {
            count[num - min]++;
        }
        int idx = 0;
        for (int freq = 1; freq <= nums.length; freq++) {
            for (int value = max; value >= min; value--) {
                if (count[value - min] == freq) {
                    for (int k = 0; k < freq; k++) {
                        nums[idx++] = value;
                    }
                }
            }
        }
        return nums;
    }
}