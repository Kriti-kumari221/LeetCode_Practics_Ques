class Solution {
    void DFS(char [][]bord,int i,int j,int r,int c,int visited[][]){
        if(i<0||i>=r||j<0||j>=c||visited[i][j]==1||bord[i][j]=='X')return ;
        visited[i][j]=1;
        DFS(bord,i+1,j,r,c,visited);
        DFS(bord,i-1,j,r,c,visited);
        DFS(bord,i,j+1,r,c,visited);
        DFS(bord,i,j-1,r,c,visited);
    }
    public void solve(char[][] board) {
        int r=board.length;
        int c=board[0].length;
        int [][]visited=new int[r][c];
        //check first and last clom;
        for(int i=0;i<r;i++){
            if(board[i][0]=='O'&&visited[i][0]==0){
                DFS(board,i,0,r,c,visited);
            }
            if(board[i][c-1]=='O'&&visited[i][c-1]==0){
                DFS(board,i,c-1,r,c,visited);
            }
        }
        //check first nd last row;
        for(int i=0;i<c;i++){
            if(board[0][i]=='O'&&visited[0][i]==0){
                DFS(board,0,i,r,c,visited);
            }
            if(board[r-1][i]=='O'&&visited[r-1][i]==0){
                DFS(board,r-1,i,r,c,visited);
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='O'&& visited[i][j]==0){
                     board[i][j]='X';
                }
            }
        }
       return;
        
        
    }
}