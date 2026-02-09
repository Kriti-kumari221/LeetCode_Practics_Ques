class Solution {
    public int dominantIndices(int[] nums) {
         int n=nums.length;
         int totSum=0;
         for(int x:nums)totSum+=x;
         int lefts=0;
         int right=0;
         int count=0;
         for(int i=0;i<n-1;i++){
            lefts+=nums[i];
            right=totSum-lefts;
            int indCount=n-i-1;
            double t=right/indCount;
            if(nums[i]>t){
                count++;
            }
         }
         return count;
    }
}