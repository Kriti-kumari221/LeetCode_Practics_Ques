class Solution {
    public int maxProfit(int[] nums) {
        int n=nums.length;
        int max=0;
        int sum=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<sum){
                sum=nums[i];
            }
            else{
                max=Math.max(max,nums[i]-sum);
            }
            
           

        }
         return max;
    }
}