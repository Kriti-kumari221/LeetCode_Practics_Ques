class Solution {
    public int[] sortedSquares(int[] nums){
        int i=0;
        int j=nums.length-1;
        int n=nums.length;
        int numz[]=new int[n];
        int z=n-1;
        while(i<=j){
            int k=nums[i]*nums[i];
            int t=nums[j]*nums[j];
            if(k<t){
               numz[z]=t;
               j--;
            }
            else{
                numz[z]=k;
                i++;
            }
            
          z--;

       }
       return numz;
    }
}