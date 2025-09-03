class Solution {
    public int numberOfPairs(int[][] points) {
        int n=points.length;
        int cnt=0;
        Arrays.sort(points,(a,b)->{
            if(a[0]!=b[0]){
                return a[0]-b[0];
            }
            else{
                return b[1]-b[0];
            }
        });
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                boolean check=false;
                int[]A=new int[2];
                int []B=new int [2];
                if(upperleft(points[i],points[j])){
                    A=points[i];
                    B=points[j];
                    check=true;
                }
                if(upperleft(points[j],points[i])){
                    A=points[j];
                    B=points[i];
                    check=true;
                }
                if(check){
                    int temp=0;
                    for(int k=0;k<n;k++){
                      
                        if(k==i || k==j){
                            continue;
                        }
                        if((A[0]<=points[k][0]&&points[k][0]<=B[0])&&
                        (A[1]>=points[k][1]&&points[k][1]>=B[1])){
                        temp++;
                        break;
                    }
                }
                
                if(temp==0){
                    cnt++;
                }
                }
            }
        }
        return cnt;
}
        boolean upperleft(int a[] ,int b[]){
            if(a[0]<=b[0]&&a[1]>=b[1]){
                return true;
            }
            return false;
        }
    }
