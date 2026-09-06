class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int res[]=new int[2];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=target-nums[i];
            if(map.containsKey(sum)){
                res[0]=map.get(sum);
                res[1]=i;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}