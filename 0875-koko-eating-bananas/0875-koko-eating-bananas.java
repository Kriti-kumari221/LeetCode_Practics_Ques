class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left=1;
       int right=(int)1e9;
       int ans=-1;
       while(left<=right){
        int mid=left+(right-left)/2;
        if(func(piles,h,mid)){
            ans=mid;
            right=mid-1;
        }
        else {
            left=mid+1;
        }
       }
       return ans;
    }
    boolean func(int []piles,int h,int mid ){
        int hour=0;
        for(int i=0;i<piles.length;i++){
            hour+=Math.ceil((piles[i]*1.0)/mid);
        }
        if(hour<=h){
            return true;
        }
        else{
            return false;
        }
    }

}