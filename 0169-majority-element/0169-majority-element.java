class Solution {
    public int majorityElement(int[] nums) {
        int lead=0;
        int candi=0;
        for(int i=0;i<nums.length;i++){
            if(lead==0) candi=nums[i];
            if(candi==nums[i]) lead++;
            else lead--;
           
        }
          return candi;   
            

         }
    }
