class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int nsum=sum;
        int right=0;
        for(int i=0;i<nums.length;i++){
            nsum=nsum-nums[i];
            if(right==nsum){
               return i;
            }
           right=right+nums[i];
        }
        return -1;
    }
}