class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=weights[0];
        int sum=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]>max){
                max=weights[i];
            }
            sum=sum+weights[i];
        }
        
        int left=max;
        int right=sum;
        int ans=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(func(weights,days,mid)){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }

        }
        return ans;
    }
        public boolean func(int []weights,int day,int mid){
            int sumn=0;
            int d=1;
            for(int i=0;i<weights.length;i++){
                if(sumn+weights[i]<=mid){
                    sumn=sumn+weights[i];
                }
                else{
                    sumn=weights[i];
                    d++;
                }
            }
            return d <= day;
        }
        
}