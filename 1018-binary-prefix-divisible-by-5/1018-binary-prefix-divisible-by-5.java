class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean>ans=new ArrayList<Boolean>();
        int pre=0;
        int l=nums.length;
        for(int i=0;i<l;i++){
            pre=((pre<<1) + nums[i]) %5;
            ans.add(pre==0);
        }
        return ans;
    }
}