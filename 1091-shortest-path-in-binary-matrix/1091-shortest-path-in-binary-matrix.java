class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        if(grid[0][0]==1||grid[n-1][m-1]==1){
            return -1;
        }
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{0,0});
        grid[0][0]=1;
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        while(!q.isEmpty()){
            int []node=q.remove();
            int i=node[0];
            int j=node[1];
            if(i==n-1 && j==m-1){
                return grid[i][j];
            }
            for(int k=0;k<8;k++){
                int x=i+dx[k];
                int y=j+dy[k];
                if(x>=0&&y>=0&&x<n&&y<m&&grid[x][y]==0){
                    grid[x][y]=grid[i][j]+1;
                    q.add(new int[]{x,y});
                }
            }
            

        }
        return -1;
       
    }
}