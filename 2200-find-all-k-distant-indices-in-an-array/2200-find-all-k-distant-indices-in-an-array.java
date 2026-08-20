class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {

        List<Integer> res = new ArrayList<>();
        boolean[] valid = new boolean[nums.length];

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] == key) {

                int start = Math.max(0, j - k);
                int end = Math.min(nums.length - 1, j + k);

                for (int i = start; i <= end; i++) {
                    valid[i] = true;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (valid[i]) {
                res.add(i);
            }
        }

        return res;
    }
}