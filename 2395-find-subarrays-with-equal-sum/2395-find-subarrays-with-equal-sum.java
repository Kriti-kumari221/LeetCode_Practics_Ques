class Solution {
    public boolean findSubarrays(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=1;i<nums.length;i++){
        int sum=nums[i-1]+nums[i];
        if(map.containsKey(sum)){
            return true;
        }
        map.put(sum,i);
        }
        return false;
    }
}