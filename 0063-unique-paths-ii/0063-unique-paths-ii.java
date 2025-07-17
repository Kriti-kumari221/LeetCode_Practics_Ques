class Solution {
    public int uniquePathsWithObstacles(int[][] obstacl) {
        int n=obstacl.length;
        int m=obstacl[0].length;
        if(obstacl[0][0]==1){
            return 0;
        }
        int dp[][]=new int[n][m];
        dp[0][0]=1;
        for(int i=1;i<n;i++){
            dp[i][0]=(obstacl[i][0]==0&&dp[0][0]==1)?1:0;
        }
        for(int j=1;j<m;j++){
            dp[0][j]=(obstacl[0][j]==0&&dp[0][0]==1)?1:0;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(obstacl[i][j]==0){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        return dp[n-1][m-1];
    }
}