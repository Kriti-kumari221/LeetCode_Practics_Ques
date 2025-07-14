class Solution {
    public boolean canJump(int[] nums) {
        int reched=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>reched){
                return false;
            }
            reched=Math.max(reched,nums[i]+i);
            }
            return true;
        }
    }
