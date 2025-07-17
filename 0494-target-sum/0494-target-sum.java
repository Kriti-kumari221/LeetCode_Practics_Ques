class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int n=nums.length;
        int m=(sum+target)/2;
        if ((sum + target) % 2 != 0 || target > sum || target < -sum) {
        return 0;
        }
        int dp[][]=new int[n+1][m+1];
         

        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(nums[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i-1]];
                }
            }

        }
        return dp[n][m];
    }
}