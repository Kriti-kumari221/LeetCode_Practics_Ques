class Solution {
    void backtrack(int[] nums, int target, int index, List<List<Integer>> res, List<Integer> output, int sum) {
        if (sum == target) {
            res.add(new ArrayList<>(output));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            if (sum + nums[i] <= target) {
                output.add(nums[i]);
                backtrack(nums, target, i, res, output, sum + nums[i]); // allow reuse
                output.remove(output.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        backtrack(candidates, target, 0, res, output, 0);
        return res;
    }
}
