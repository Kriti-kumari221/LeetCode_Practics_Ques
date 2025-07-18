class Solution {
    void DFS(int[][]img,int sr,int sc,int color,int r,int c,int old){
        if(sr==r||sc==c||sr<0||sc<0||img[sr][sc]!=old||img[sr][sc]==color){
            return ;
        }
        img[sr][sc]=color;
        DFS(img,sr,sc+1,color,r,c,old);
        DFS(img,sr-1,sc,color,r,c,old);
        DFS(img,sr,sc-1,color,r,c,old);
        DFS(img,sr+1,sc,color,r,c,old);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int r=image.length;
        int c=image[0].length;
        int old=image[sr][sc];
        DFS(image,sr,sc,color,r,c,old);
        return image;
    }
}