class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    q.add(new int[]{i,j});
                }
                else{
                    mat[i][j]=Integer.MAX_VALUE;
                }
            }
        }
     int []dx={0,0,1,-1};
     int []dy={1,-1,0,0};
     while(!q.isEmpty()){
        int size=q.size();
            int []node=q.remove();
            int i=node[0];
            int j=node[1];
            for(int k=0;k<4;k++){
                int x=i+dx[k];
                int y=j+dy[k];
                if(x>=0&&y>=0&&x<n &&y<m&&mat[x][y]>1+mat[i][j]){
                    mat[x][y]=1+mat[i][j];
                    q.add(new int[]{x,y});
                    
                }

            }
        }
       return mat;
        }

     }   
    
