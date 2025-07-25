class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            if(maxsum<sum){
                maxsum=sum;
            }
        }
        return maxsum;
    }
}