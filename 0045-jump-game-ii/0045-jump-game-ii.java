class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int reched=0;
        int end=0;
        int count=0;
        for(int i=0;i<n;i++){
            reched=Math.max(reched,nums[i]+i);
           if(i==end){
            count++;
            end=reched;
           }
           
        }
        return count-1;
    }
}