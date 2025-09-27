class Solution {
    public double largestTriangleArea(int[][] points) {
        int n=points.length;
        double max=0;
        for(int i=0;i<n-2;i++){
            int a0=points[i][0], a1=points[i][1];
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    double area=0.5*Math.abs((points[j][0]-a0)*(points[k][1]-a1)-(points[j][1]-a1)*(points[k][0]-a0));
                    max=Math.max(max,area);
                }
            }
        }
        return max;
        

    }
}