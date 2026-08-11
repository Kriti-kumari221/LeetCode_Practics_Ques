class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int res[]=new int[2];
        int max=0;
        int n=mat.length;
        int ind=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(max<count){
                max=count;
                ind=i;
            }
        }
        res[0]=ind;
        res[1]=max;
        return res;
        
    }
}