class Solution {
    public int findPeakElement(int[] nums) {
        int right=nums.length-1;
        int left=0;
        int ans=0;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[mid+1]){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
        
    }
}