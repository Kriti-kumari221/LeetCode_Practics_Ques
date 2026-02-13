class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int ans=-1;
        int max= (int)1e9;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(fun(piles,h,mid)){
                ans=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
    }
    boolean fun(int []piles,int h,int mid){
        int hour=0;
        for(int i=0;i<piles.length;i++){
        hour+=Math.ceil(piles[i]*1.0/mid);
        }
        return hour<=h;
    }
}