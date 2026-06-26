class Solution {
    public int shipWithinDays(int[]arr, int days) {
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            sum=sum+arr[i];
        }
       int left=max;
        int right=sum;
        int res=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(fun(arr,mid,days)){
                res=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return res;

    }
    boolean fun(int arr[],int mid,int days){
        int d=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=mid){
                sum=sum+arr[i];
            }
            else{
                sum=arr[i];
                d++;
            }
        }
        if(d<=days){
            return true;
        }
        return false;
    }
}