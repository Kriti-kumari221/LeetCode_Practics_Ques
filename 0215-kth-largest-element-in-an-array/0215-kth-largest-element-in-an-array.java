class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
       return  quickS(nums,0,n-1,n-k);
    }
    int quickS(int nums[],int left,int right,int k){
        int pindex=left;
        int pivot=nums[right];
        for(int i=left;i<right;i++){
            if(nums[i]<pivot){
                swap(nums,pindex,i);
                pindex++;
            }
        }
        swap(nums,pindex,right);
        if(pindex==k)return nums[pindex];
        else if(pindex<k){
            return quickS(nums,pindex+1,right,k);
        }
        else{
           return  quickS(nums,left,pindex-1,k);
        }
        
    }
    private void swap(int[] nums, int i, int j) {
         int temp = nums[i]; 
         nums[i] = nums[j]; 
         nums[j] = temp; }
}