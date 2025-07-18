class Solution {
    void DFS(int[][]grid,int i,int j,int c,int r,int[] temp){
        if(i==r||c==j||i<0||j<0||grid[i][j]==0){
            return ;
        }
        temp[0]++;
        grid[i][j]=0;
        DFS(grid,i,j+1,c,r,temp);
        DFS(grid,i-1,j,c,r,temp);
        DFS(grid,i,j-1,c,r,temp);
        DFS(grid,i+1,j,c,r,temp);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int ans=0;
       
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    int []temp=new int[1];
                    DFS(grid,i,j,c,r,temp);
                    ans=Math.max(ans,temp[0]);
                }
            }
        }
        return ans;
    }
}